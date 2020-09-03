import { LoginPage } from './login.po';
import { browser } from 'protractor';

describe('Login tests', () => {
    let page: LoginPage;

    beforeEach(() => {
        page = new LoginPage();
        page.navigateTo();
    });

    it('Login form should be valid', () => {
        page.getEmailText().sendKeys('shridharpatil9868@gmail.com');
        page.getPasswordText().sendKeys('shridhar');
        browser.sleep(1000)
        let form = page.getForm().getAttribute('class');

        expect(form).toContain('ng-valid');
    });

    it('Login form should be invalid', () => {
        page.getEmailText().sendKeys('');
        page.getPasswordText().sendKeys('');
        browser.sleep(1000)
        let form = page.getForm().getAttribute('class');

        expect(form).toContain('ng-invalid');
    });

    it('Should set email value to local storage', () => {
        page.getEmailText().sendKeys('shridharpatil9868@gmail.com');
        page.getPasswordText().sendKeys('Shridhar');
        page.getSubmitButton().click();
        // localStorage.setItem('LoggedInUser','shridharpatil9868@gmail.com')
        let valLocalStorage  = browser.executeScript("return window.localStorage.getItem('user');");
       
        expect(valLocalStorage).toEqual(null);
      
    });
});