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
    const skills=document.getElementById('skills');

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
        const skillsVal=skills.value.trim();

        if(firstNameVal === ''){
            //Show Error
            //Add Error Class
            setErrorFor(firstName,'First Name cannot be blank');
        }else{
            //Add Success Class
            setSuccessFor(firstName);
        }
    }

    function setErrorFor(input,message) {
        const formControl = input.parentElement; // .form-control
        const small = formControl.querySelector('small');

        //Add Error Message Inside <small> tag
        small.innerText = message;

        //Add Error Class
        formControl.className = '.form-control.error';
    }
});
