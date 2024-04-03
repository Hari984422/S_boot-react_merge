import React, { useState } from 'react'

function ConfirmOTP() {
    let [otp,setotp] = useState("")
    let x = JSON.parse(localStorage.getItem("otp"))
    console.log(x);
    let verify = () =>{
        if(otp == x){
            alert('Logged in Succesfully')
            
        }
        else{
            alert("Invalid OTP")
        }
    }
  return (
    <div className='ConfirmOTP'>
        <h1>ConfirmOTP</h1>

        <form onSubmit={verify} action="">
            <fieldset>
                <legend>OTP Verify</legend>
                <input value={otp} onChange={(e)=>{setotp(e.target.value)}} type="text" placeholder='Enter the OTP that has been sent to your mail' />
                <button>Verify</button>
            </fieldset>
        </form>
    </div>
  )
}
export default ConfirmOTP