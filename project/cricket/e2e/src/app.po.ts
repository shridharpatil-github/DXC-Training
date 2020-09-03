import { browser, by, element, ElementFinder } from 'protractor';

export class AppPage {
  navigateTo(): Promise<unknown> {
    return browser.get(browser.baseUrl) as Promise<unknown>;
  }

  getHeaderH1() : ElementFinder
  {
     return element(by.tagName('app-home h1'));
  }

 getHeaderH1count() 
  {
    let headers=element.all(by.css('app-home h1'));
     return headers.count();
  }

  getHeaderText() {
    return element(by.css('app-home h1')).getText() as Promise<string>;
  } 
}
