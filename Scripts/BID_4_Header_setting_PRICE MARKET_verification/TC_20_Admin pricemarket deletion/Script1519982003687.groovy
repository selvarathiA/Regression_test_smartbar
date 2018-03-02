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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://beta1.beerboard.com/')

WebUI.click(findTestObject('pricemarket_creation_updation_deletion/Page_Welcome to SmartBar (2)/button_Dont Allow'))

WebUI.setText(findTestObject('pricemarket_creation_updation_deletion/Page_Welcome to SmartBar (2)/input_useremail'), 'admin')

WebUI.setText(findTestObject('pricemarket_creation_updation_deletion/Page_Welcome to SmartBar (2)/input_userpassword'), 
    'password')

WebUI.click(findTestObject('pricemarket_creation_updation_deletion/Page_Welcome to SmartBar (2)/span_Login'))

WebUI.delay(60)

WebUI.waitForPageLoad(500)

//WebUI.delay(15)
WebUI.mouseOverOffset(findTestObject('Admin_create_user/Page_SmartBar  Admin Dashboard/i_fa fa-cog'), 10, 10)

WebUI.click(findTestObject('Admin_create_user/Page_SmartBar  Admin Dashboard/i_fa fa-cog'))

//WebUI.delay(15)
//WebUI.mouseOverOffset(findTestObject('Admin_create_user/Page_SmartBar  Admin Dashboard/span_Retailer Settings'), 10, 10)
//WebUI.click(findTestObject('Admin_create_user/Page_SmartBar  Admin Dashboard/span_Retailer Settings'))
WebUI.doubleClick(findTestObject('Admin_create_user/Page_SmartBar  Admin Dashboard/Page_SmartBar  Admin Dashboard/a_Retailer Settings'))

WebUI.delay(30)

WebUI.selectOptionByValue(findTestObject('pricemarket_creation_updation_deletion/Page_SmartBar  Admin Dashboard/select_LocationUserRegionPrice'), 
    'string:market', true)

WebUI.delay(30)

WebUI.setText(findTestObject('pricemarket_creation_updation_deletion/Page_SmartBar  Admin Dashboard/input_form-control custom_sel_'), 
    'adminprice')

WebUI.click(findTestObject('pricemarket_creation_updation_deletion/Page_SmartBar  Admin Dashboard/a_Delete Price Market'))

WebUI.click(findTestObject('pricemarket_creation_updation_deletion/Page_SmartBar  Admin Dashboard/button_Ok'))

WebUI.click(findTestObject('pricemarket_creation_updation_deletion/Page_SmartBar  Admin Dashboard/div_Price Market Deleted succe'))

WebUI.delay(30)

WebUI.closeBrowser()

