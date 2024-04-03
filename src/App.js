import logo from './logo.svg';
import './App.css';
import {BrowserRouter,Routes,Route} from 'react-router-dom'
import AdminLogin from './Components/AdminLogin';
import ConfirmOTP from './Components/ConfirmOTP';
function App() {
  return (
    <div className="App">
     <BrowserRouter>
     <Routes>
      <Route path='/' element={<AdminLogin/>}/>
      <Route path='/otp-admin' element={<ConfirmOTP/>}/>
     </Routes>
     </BrowserRouter>
    </div>
  );
}

export default App;
