const viewProf=document.getElementById('card');
const modelContainer=document.getElementById('modal-container');
const close=document.getElementById('close-btn')

viewProf.addEventListener('click',()=>{
    modelContainer.classList.add('show');
});

close.addEventListener('click',()=>{
    modelContainer.classList.remove('show');
});