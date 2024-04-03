import React, { useState } from 'react'
import '../Styles/AdminLogin.css'
import axios from 'axios'
import { useNavigate } from 'react-router-dom'
function AdminLogin() {
    let [email,setemail] = useState("")
    let [pswd,setpswd] = useState("")
    let navigate = useNavigate()

    
    let checkData = (e) =>{
        e.preventDefault();
        axios.get(`http://localhost:8080/login?email=${email}&pswd=${pswd}`)
        .then((res)=>{
            navigate('/otp-admin')
            localStorage.setItem("otp",res.data)
            alert("Logged in success fully")
            console.log(res);
        })
        .catch((err)=>{
            console.log(err);
            alert("Invalid Credentials")
        })

    }
   return (
    <div className='AdminLogin'>
        <form action="">
            <label htmlFor="">User Name</label>
            <input value={email} onChange={(e)=>{setemail(e.target.value)}} required type="text" placeholder='Enter the UserName' />
            <label htmlFor="">Passsword</label>
            <input value={pswd} onChange={(e)=>{setpswd(e.target.value)}} required type="text" placeholder='Enter the Password' />
            <button onClick={checkData}>Login In</button>
        </form>
    </div>
  )
}
export default AdminLogin