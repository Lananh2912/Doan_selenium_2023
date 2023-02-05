package pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import pageobjectcommon.PageObjectCommon;

public class AddPage  extends PageObjectCommon{
	  WebDriver driver;
	    
	    @FindBy(how = How.XPATH, using= "//span[text()='Quản lý công việc']")
	    public WebElement tagQLCV;
	    @FindBy(how = How.XPATH, using="//button[text()='Thêm mới']")
	    //@FindBy(how = How.XPATH, using="//button[text()='Đăng nhập']")
	    public WebElement btnThemMoi;
	   
	    @FindBy(how = How.XPATH, using="//tr[@class='z-row'][1]//input")
	    public WebElement tencongviec;
	    
	    @FindBy(how = How.XPATH, using="//tr[@class='z-row'][2]//input")
	    public WebElement mota;
	    
	    @FindBy(how = How.XPATH, using="//tr[@class='z-row z-grid-odd'][2]//input")
	    public WebElement mdut;
	    
	    @FindBy(how = How.XPATH, using="//tr[@class='z-row'][3]//input")
	    public WebElement bomon;
	  
	    @FindBy(how = How.XPATH, using="//div[@class='z-window-content']//button")
	    public WebElement btnthemmoi;
	    
	    @FindBy(how = How.XPATH, using="//div[@class='z-messagebox z-div']")
	    public WebElement alertMessges;
	   
	    @FindBy(how = How.XPATH, using="//input[@class='z-datebox-input']")
	    public WebElement txtFromDate;
	    
	    @FindBy(how = How.XPATH, using="//input[@class='z-textbox']")
	    public WebElement txtTenCongViec;
	    
	    
	    @FindBy(how=How.XPATH, using="//button[text()=' Tìm kiếm']")
	    public WebElement btntimkiem;

	    @FindBy(how=How.XPATH, using="//div[@class='z-hlayout-inner']//button[text()='Cập nhật']")
	    public WebElement btnCapNhap;
	    
	    @FindBy(how=How.XPATH, using="//div[@class='z-window-content']//button[text()='Cập nhật']")
	    public WebElement popbtnCapNhap;
	   
	    
	    @FindBy(how=How.XPATH, using="//span[contains(text(),'Tên nhiệm vụ')]//parent::div//parent::td//following::td[1]//input")
	    public WebElement txtTencongviec;
	    
	    @FindBy(how=How.XPATH, using="//span[contains(text(),'Tên nhiệm vụ')]//parent::div//parent::td//following::td[5]//input")
	    public WebElement txtMoTaCapNhap;
	    
	    
	    @FindBy(how=How.XPATH, using="//div[contains(text(),'automation_test33')]")
	    public WebElement txtNewNameCongViec;
	    
	    @FindBy(how=How.XPATH, using="//div[contains(text(),'do an selenium_auto50')]")
	    public WebElement txtNewNameUpateCongViec;
	    
	    @FindBy(how=How.XPATH, using="//button[contains(text(),'Tạm dừng')]")
	    public WebElement btnTamdung;
	    
	    @FindBy(how=How.XPATH, using="//button[contains(text(),'Yes')]")
	    public WebElement popbtnYes;
	    
	    

	    @FindBy(how=How.XPATH, using="//span[contains(text(),'Danh sách tạm dừng')]")
	    public WebElement tagDanhSachTamDung;
	
	    public AddPage (WebDriver driver) {
	         edriver = driver;
	         PageFactory.initElements(driver, this);
	         setDriver(edriver);
	    }
	    public void clickadd() throws Exception
	    {
	    	tagQLCV.click();
	    	
	    	try {
				waitUntilElementIsVisible(btnThemMoi);
				focusClick(btnThemMoi);
			} catch (Exception e) {
				// TODO: handle exception
			}
	    //	focusClick(btnThemMoi);
	    }
	    public void clickQLCV()
	    {
	    	tagQLCV.click();
	    }
	    public void search(String name) throws Exception
	    {
	    	
	    	sendKeys(txtTenCongViec, name);
	    	txtFromDate.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), Keys.DELETE);
	    	enterNonEmptyValue(txtFromDate, "01/01/2021");
	    	btntimkiem.click();
	    	
	    }
	    public void enterInfor(String tenCongViec, String moTa ) throws Exception
	    {
	      	enterNonEmptyValue(tencongviec, tenCongViec);
	    	enterNonEmptyValue(mota, moTa);
	    	enterNonEmptyValue(mdut, "Hight");
	    	enterNonEmptyValue(bomon, "bmkhmt");

	    }
	    
	    public void ClickThemMoi()
	    {
	    	try {
				waitUntilElementIsVisible(btnthemmoi);
				focusClick(btnthemmoi);
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	    public void alert()
	    {
	    	try {
				waitUntilElementIsVisible(alertMessges);
				//focusClick(btnthemmoi);
			} catch (Exception e) {
				// TODO: handle exception
			}
	    	
	    }
	    
	    public void ClickButtonCapNhap()
	    {
	    	try {
				waitUntilElementIsVisible(btnCapNhap);
				focusClick(btnCapNhap);
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }
	    
	    public void enterInforCapNhap(String tenCongViec, String moTa ) throws Exception
	    {
	      	enterNonEmptyValue(txtTencongviec, tenCongViec);
	    	enterNonEmptyValue(txtMoTaCapNhap, moTa);
	    	popbtnCapNhap.click();
	    }
	    
	    public void verifyAdd()
	    {
	    	try {
				waitUntilElementIsVisible(txtNewNameCongViec);
				 boolean isNewNamePresent = txtNewNameCongViec.isDisplayed();
		            if(isNewNamePresent) {
		                System.out.println("New Name is present");
		            }
		            else
		            	System.out.println("New Name is not present");
			} catch (Exception e) {
				// TODO: handle exception
			}
           
	    }
	    
	    public void verifyCapNhap()
	    {
	    	try {
				waitUntilElementIsVisible(txtNewNameUpateCongViec);
				 boolean isNewNamePresent = txtNewNameUpateCongViec.isDisplayed();
		            if(isNewNamePresent) {
		                System.out.println("New Name is present");
		            }
		            else
		            	System.out.println("New Name box is present");
			} catch (Exception e) {
				// TODO: handle exception
			}
           
	    }
	    public void ActiveTamdung()
	    {
	    	
	    	try {
				waitUntilElementIsVisible(btnTamdung);
				waitUntilElementIsClickable(btnTamdung);
				btnTamdung.click();
				waitUntilElementIsVisible(popbtnYes);
				waitUntilElementIsClickable(popbtnYes);
				popbtnYes.click();
		    	waitUntilElementIsVisible(tagDanhSachTamDung);
		    	waitUntilElementIsClickable(tagDanhSachTamDung);
				tagDanhSachTamDung.click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
}
