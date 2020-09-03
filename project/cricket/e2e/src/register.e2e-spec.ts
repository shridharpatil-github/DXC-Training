
import { browser } from 'protractor';
import { RegisterPage } from './register.po';

describe('Register form tests', () => {
    let page: RegisterPage;

    beforeEach(() => {
        page = new RegisterPage();
        page.navigateTo();
    });

    it('Register form should be valid', () => {
        page.getFirstName().sendKeys('shridhar');
        page.getLastName().sendKeys('patil');
        page.getEmail().sendKeys('shridharpatil9868@gmail.com');
        page.getPhoneNo().sendKeys('123456777');
        page.getPassword().sendKeys('Mypassword@12');
        page.getConfirmPassword().sendKeys('Mypassword@12');
        let form = page.getForm().getAttribute('class');
        browser.sleep(1000);
        expect(form).toContain('ng-valid');
    });

    it('Register form should be invalid', () => {
        page.getFirstName().sendKeys('');
        page.getLastName().sendKeys('');
        page.getEmail().sendKeys('');
        page.getPhoneNo().sendKeys();
        page.getPassword().sendKeys('');
        browser.sleep(1000)
        let form = page.getForm().getAttribute('class');

        expect(form).toContain('ng-invalid');
    });
});