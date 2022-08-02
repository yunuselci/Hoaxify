import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import './bootstrap-override.scss';
import App from './App';
import UserSignupPage from './pages/UserSignupPage';
import reportWebVitals from './reportWebVitals';
import './i18n';
import LoginPage from './pages/LoginPage';
import LanguageSelector from './components/LanguageSelector';

ReactDOM.render(
  <div>
    <LoginPage />
    <LanguageSelector />
  </div>,
  document.getElementById('root')
);


reportWebVitals();
