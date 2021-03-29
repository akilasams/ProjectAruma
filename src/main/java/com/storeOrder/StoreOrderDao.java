package com.storeOrder;

import com.dbConnection.MyConnection;

import javax.servlet.http.Cookie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StoreOrderDao {

    public boolean insertOrder(StoreOrder order){
        Connection connection = MyConnection.getConnection();
        String insertOrder_SQL = "INSERT INTO store_order values (DEFAULT,?,NOW(),NULL)";

        try {
            PreparedStatement st = connection.prepareStatement(insertOrder_SQL);
            st.setInt(1,order.getCartId());
            if(st.executeUpdate()>0 ? true : false){
                int lastOrderId = getLastOrderId();
                if(insertOrderItems(lastOrderId,order.getItemsList())){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    public boolean insertOrderItems(int orderId, List<StoreOrderItem> itemsList){
        Connection connection = MyConnection.getConnection();
        String insertOrderItems_SQL = "INSERT INTO order_item VALUES(?,?,?,?)";

        try {
            PreparedStatement st = connection.prepareStatement(insertOrderItems_SQL);
            for(StoreOrderItem item : itemsList){
                st.setInt(1,orderId);
                st.setInt(2,item.getItemId());
                st.setInt(3,item.getQantity());
                st.setDouble(4,item.getUnitPrice());
                st.executeUpdate();
            }
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    public static int getLastOrderId(){
        Connection connection = MyConnection.getConnection();
        String selectLastOrderId_SQL = "SELECT MAX(order_id) AS last_order_id FROM store_order";

        try {
            PreparedStatement st = connection.prepareStatement(selectLastOrderId_SQL);
            ResultSet rs = st.executeQuery();

            if(rs.next()==false){
                return 0;
            }else {
                do {
                    int lastOrderId = rs.getInt("last_order_id");
                    return lastOrderId;
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    public StoreOrder getOrderDetails(int orderId){
        StoreOrder storeOrder = null;
        String getOrderDetails_SQL = "SELECT * FROM store_order WHERE order_id = ?";

        Connection connection = MyConnection.getConnection();
        try {
            PreparedStatement st = connection.prepareStatement(getOrderDetails_SQL);
            st.setInt(1,orderId);
            ResultSet rs = st.executeQuery();
            if(rs.next() == false){
                return null;
            }else{
                do{
                    int thisOrderId = rs.getInt("order_id");
                    int cart_id = rs.getInt("cart_id");
                    String order_date = rs.getString("order_date");
                    double total = rs.getDouble("total");
                    storeOrder = new StoreOrder(thisOrderId,cart_id,order_date,total);
                }while(rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return storeOrder;
    }

    public boolean buyNow(InstantPurchase instantPurchase){
        Connection connection = MyConnection.getConnection();
        String enterOrderInto_store_order_SQL = "INSERT INTO store_order VALUES(DEFAULT,?,NOW(),?)";

        try {
            PreparedStatement st1 = connection.prepareStatement(enterOrderInto_store_order_SQL);
            st1.setInt(1,instantPurchase.getCartId());
            st1.setDouble(2,instantPurchase.getUnitPrice());
            if(st1.executeUpdate()>0? true : false){
                int orderId = StoreOrderDao.getLastOrderId();
                String enterInto_order_item_SQL = "INSERT INTO order_item VALUES(?,?,?,?)";
                PreparedStatement st2 = connection.prepareStatement(enterInto_order_item_SQL);
                st2.setInt(1,orderId);
                st2.setInt(2,instantPurchase.getItemId());
                st2.setInt(3,instantPurchase.getQuanity());
                double total = instantPurchase.getUnitPrice()*instantPurchase.getQuanity();
                st2.setDouble(4,total);

                if(st2.executeUpdate()>0? true: false){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
