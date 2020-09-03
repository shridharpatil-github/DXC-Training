import { AppPage } from './app.po';
import { browser, logging } from 'protractor';
import { Location } from "@angular/common";

import { TestBed, fakeAsync, tick } from "@angular/core/testing";
import { Router } from "@angular/router";
describe('workspace-project App', () => {
  let page: AppPage;
  beforeEach(() => {
    page = new AppPage();
  });
  it('the heading H1 content should be Welcome To Cric-Info.com', () => {
    page.navigateTo();
    expect(page.getHeaderText()).toEqual('Welcome To Cric-Info.com');
  });

  it('h1 tag should be present to display the heading for the details',()=>{
    page.navigateTo();
    expect(page.getHeaderH1()).toBeTruthy();
  
  });
  


  afterEach(async () => {
    // Assert that there are no errors emitted from the browser
    const logs = await browser.manage().logs().get(logging.Type.BROWSER);
    expect(logs).not.toContain(jasmine.objectContaining({
      level: logging.Level.SEVERE,
    } as logging.Entry));
  });
  
});
