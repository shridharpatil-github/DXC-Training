import { browser, element, by } from 'protractor';


export class LoginPage{
    navigateTo(){
        return browser.get('/login');
    }

    getEmailText() {
        return element(by.name('email'));
    }
    getPasswordText() {
        return element(by.name('pwd'));
    }

    getForm(){
        return element(by.css('#loginForm'));
    }

    getSubmitButton(){
        return element(by.css('#btnSubmit'));
    }
}