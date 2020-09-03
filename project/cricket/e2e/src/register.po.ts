import { browser, element, by, ElementFinder } from 'protractor';


export class RegisterPage{
    navigateTo(){
        return browser.get('/register');
    }

    getFirstName() {
        return element(by.name('firstName'));
    }
    getLastName() {
        return element(by.name('lastName'));
    }
    getEmail() {
        return element(by.name('email'));
    } 
    getPhoneNo() {
        return element(by.name('phoneNo'));
    }
    getPassword() {
        return element(by.name('password'));
    }
    getConfirmPassword() {
        return element(by.name('cpassword'));
    }
    
    getForm(){
        return element(by.css('#registerForm'));
    }

    getSubmitButton(){
        return element(by.css('#btnSubmit'));
    }
}