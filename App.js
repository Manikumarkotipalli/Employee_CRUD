import React from 'react';
import {BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import FooterComponent from './Components/FooterComponent';
import HeaderComponent from './Components/HeaderComponent';
import './App.css';
import ListEmployeeComponent from './Components/ListEmployeeComponent';
import EmployeeComponent from './Components/EmployeeComponent';
import {EmployeeService} from './Services/EmployeeService';


function App() {
  return (
    <div className="App">
      <Router>
        
        
        <HeaderComponent />
        <div className= "container">
          <Routes>
              <Route path = "/" element = { <ListEmployeeComponent /> }></Route>
              <Route path = "/employees" element = { <ListEmployeeComponent /> }></Route>
              <Route path = "/add-employee" element = { <EmployeeComponent />} ></Route>
              <Route path = "/edit-employee/:id" element = { <EmployeeComponent />}></Route>
            </Routes>
        </div>
        <FooterComponent />
        
        
        </Router>
    </div>
  );
}

export default App;
