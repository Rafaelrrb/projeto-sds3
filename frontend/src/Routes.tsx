import Dashboard from "pages/Dashboard";
import Home from "pages/Home";

import { Route,BrowserRouter,Routes } from "react-router-dom";

function Routess() {
  return (
    <BrowserRouter>
      <Routes>
      <Route path='/' element={<Home/>} />

      <Route path='/dashboard' element={<Dashboard/>} />
       
      </Routes>
    </BrowserRouter>
  );
}

export default Routess;