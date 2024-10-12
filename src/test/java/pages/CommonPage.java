package pages;

import org.openqa.selenium.support.PageFactory;

import static stepDefinitions.Hooks.driver;

public abstract class CommonPage {

    public HomePage homePage;
    public LoginPage loginPage;
    public BlogPage blogPage;
    public FarmersMarketPage farmersMarketPage;
    public ExplorePage explorePage;
    public AboutUsPage aboutUsPage;
    public ContactUsPage contactUsPage;

    public RegisterPage registerPage;


    public CommonPage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public BlogPage getBlogPage() {
        if (blogPage == null) {
            blogPage = new BlogPage();
        }
        return blogPage;
    }

    public FarmersMarketPage getFarmersMarketPage() {
        if (farmersMarketPage == null) {
            farmersMarketPage = new FarmersMarketPage();
        }
        return farmersMarketPage;
    }

    public ExplorePage getExplorePage() {
        if (explorePage == null) {
            explorePage = new ExplorePage();
        }
        return explorePage;
    }

    public AboutUsPage getAboutUsPage() {
        if (aboutUsPage == null) {
            aboutUsPage = new AboutUsPage();
        }
        return aboutUsPage;
    }

    public ContactUsPage getContactUsPage() {
        if (contactUsPage == null) {
            contactUsPage = new ContactUsPage();
        }
        return contactUsPage;
    }

    public RegisterPage getRegisterPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage();
        }
        return registerPage;
    }
}
