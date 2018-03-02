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

WebUI.setText(findTestObject('Admin_pricemarket_creation/Page_Welcome to SmartBar/input_useremail'), 'admin')

WebUI.setText(findTestObject('Admin_pricemarket_creation/Page_Welcome to SmartBar/input_userpassword'), 'password')

WebUI.click(findTestObject('Admin_pricemarket_creation/Page_SmartBar  Retailer Dashboard/button_Dont Allow'))

WebUI.click(findTestObject('Admin_pricemarket_creation/Page_Welcome to SmartBar/span_Login'))

WebUI.delay(30)

WebUI.click(findTestObject('Admin_pricemarket_creation/Page_SmartBar  Admin Dashboard/a_nav-link nav-toggle'))

WebUI.click(findTestObject('Admin_pricemarket_creation/Page_SmartBar  Admin Dashboard/a_Retailer Settings'))

WebUI.delay(30)

WebUI.selectOptionByValue(findTestObject('Admin_pricemarket_creation/Page_SmartBar  Admin Dashboard/select_LocationUserRegionPrice'), 
    'string:market', false)

WebUI.delay(30)

WebUI.click(findTestObject('Admin_pricemarket_creation/Page_SmartBar  Admin Dashboard/a_Add Price Market'))

WebUI.setText(findTestObject('Admin_pricemarket_creation/Page_SmartBar  Admin Dashboard/input_name'), 'pricemarket2')

WebUI.click(findTestObject('Admin_pricemarket_creation/Page_SmartBar  Admin Dashboard/button_Create'))

WebUI.click(findTestObject('Admin_pricemarket_creation/Page_SmartBar  Admin Dashboard/div_Market Added Successfully.'))

WebUI.closeBrowser()

