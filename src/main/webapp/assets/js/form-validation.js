$(document).ready(function (){
    const form=document.getElementById('form');
    const firstName=document.getElementById('firstName');
    const lastName=document.getElementById('lastName');
    const email=document.getElementById('email');
    const address=document.getElementById('address');
    const mobileNo=document.getElementById('mobileNo');
    const username=document.getElementById('username');
    const password=document.getElementById('password');
    const retypePassword=document.getElementById('retypePassword');
    // const skills=document.getElementById('skills');

    form.addEventListener('submit',(e)=>{
        e.preventDefault();
        checkInputs();
    });

    function checkInputs(){
        //Get the Values from the Inputs First
        const firstNameVal=firstName.value.trim();
        const lastNameVal=lastName.value.trim();
        const emailVal=email.value.trim();
        const addressVal=address.value.trim();
        const mobileNoVal=mobileNo.value.trim();
        const usernameVal=username.value.trim();
        const passwordVal=password.value.trim();
        const retypePasswordVal=retypePassword.value.trim();
        // const skillsVal=skills.value.trim();

        if(firstNameVal === ''){
            //Show Error
            setErrorFor(firstName,'First Name cannot be blank');
        }else{
            //Add Success Class
            setSuccessFor(firstName);
        }

        if(lastNameVal === ''){
            setErrorFor(lastName,'Last Name cannot be blank');
        }else{
            setSuccessFor(lastName);
        }

        if(emailVal === ''){
            setErrorFor(email,'Email cannot be blank');
        }else if(!isEmail(emailVal)){
            setErrorFor(email,'Email is not Valid');
        }else{
            setSuccessFor(email);
        }

        if(addressVal === ''){
            setErrorFor(address,'Address cannot be blank');
        }else{
            setSuccessFor(address);
        }

        if(mobileNoVal === ''){
            setErrorFor(mobileNo,'Mobile No cannot be blank');
        }else{
            setSuccessFor(mobileNo);
        }

        if(usernameVal === ''){
            setErrorFor(username,'Username cannot be blank');
        }else{
            setSuccessFor(username);
        }


        if(passwordVal === ''){
            setErrorFor(password,'Password cannot be blank');
        }else{
            setSuccessFor(password);
        }

        if(retypePasswordVal === ''){
            setErrorFor(retypePassword,'Password cannot be blank');
        }else if(passwordVal !== retypePasswordVal){
            setErrorFor(retypePassword,'Password does not match');
        }else{
            setSuccessFor(retypePassword);
        }

    }

    function setErrorFor(input,message) {
        const formControl = input.parentElement; // .form-control
        const small = formControl.querySelector("small");
        //Add Error Message Inside <small> tag
        small.innerText = message;
        //Add Error Class
        formControl.className = "form-control error";
    }

    function setSuccessFor(input) {
        const formControl = input.parentElement; // .form-control
        formControl.className = "form-control success";
    }

    function isEmail(email){
        const re = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(String(email).toLowerCase());
    }
});
