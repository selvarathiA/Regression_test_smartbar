import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://beta1.beerboard.com/')

WebUI.click(findTestObject('User_creation_deletion/Page_Welcome to SmartBar (5)/button_Dont Allow'))

WebUI.setText(findTestObject('User_creation_deletion/Page_Welcome to SmartBar (5)/input_useremail'), 'admin')

WebUI.setText(findTestObject('User_creation_deletion/Page_Welcome to SmartBar (5)/input_userpassword'), 'password')

WebUI.click(findTestObject('User_creation_deletion/Page_Welcome to SmartBar (5)/span_Login'))

WebUI.delay(30)

WebUI.click(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/a_nav-link nav-toggle'))

WebUI.click(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/span_Retailer Settings'))

WebUI.selectOptionByValue(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/select_LocationUserRegionPrice'), 
    'string:user', true)

WebUI.delay(30)

WebUI.click(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/a_Add User'))

WebUI.delay(30)

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/input_first_name'), 'selvarathi')

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/input_last_name'), 'arun')

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/input_email'), 'selvarathi.arun@gmail.com')

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/input_mobile'), '969756848')

WebUI.selectOptionByValue(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/select_ATTVerizonT-MobileSprin'), 
    'string:sprint', true)

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/input_username'), 'spritler')

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/input_password'), 'password')

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/input_password_confirmation'), 'password')

WebUI.scrollToElement(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/button_Create User'), 20)

WebUI.selectOptionByValue(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard (1)/select_Admin User - Twin Peaks'), 
    'number:68', true)

WebUI.doubleClick(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/input_ui-select-search input-x'))

WebUI.sendKeys(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/input_ui-select-search input-x'), Keys.chord(
        Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/select_NoneLevel 1Level 2'), 
    'number:1', true)

WebUI.click(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/button_Create User'))

WebUI.click(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard/div_User Added Successfully.'))

WebUI.delay(30)

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Admin Dashboard/input_form-control custom_sel_'), 'spritler')

WebUI.closeBrowser()

WebUI.closeBrowser()

