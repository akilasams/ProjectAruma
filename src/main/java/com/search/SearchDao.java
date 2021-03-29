package com.search;

import com.dbConnection.MyConnection;
import com.design.Design;
import com.design.DesignDao;
import com.storeItem.StoreItem;
import com.storeItem.StoreItemDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SearchDao {

    public List<StoreItem> searchKeyword(String keyword){
        List<Integer> itemIdList = new ArrayList<>();
        Connection connection = MyConnection.getConnection();
        String searchDesign_SQL = "SELECT s.design_id FROM store_item s INNER JOIN design d ON s.design_id=d.design_id WHERE d.design_name LIKE ?";

        try {
            PreparedStatement st = connection.prepareStatement(searchDesign_SQL);
            st.setString(1,"%"+keyword+"%");
            ResultSet rs = st.executeQuery();
            if(rs.next()==false){
                return null;
            }else{
                do{
                    itemIdList.add(rs.getInt("design_id"));
                }while(rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        StoreItemDao dao = new StoreItemDao();
        List<StoreItem> searchResults = dao.searchDesigns(itemIdList);
        return searchResults;
    }
}
