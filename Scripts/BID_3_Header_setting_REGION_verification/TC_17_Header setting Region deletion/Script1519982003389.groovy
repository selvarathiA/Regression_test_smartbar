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

WebUI.maximizeWindow()

WebUI.click(findTestObject('header_setting/Page_Welcome to SmartBar (1)/button_Dont Allow'))

WebUI.setText(findTestObject('header_setting/Page_Welcome to SmartBar (1)/input_useremail'), 'testdolly')

WebUI.setText(findTestObject('header_setting/Page_Welcome to SmartBar (1)/input_userpassword'), 'password')

WebUI.click(findTestObject('header_setting/Page_Welcome to SmartBar (1)/span_Login'))

WebUI.waitForPageLoad(20, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(20)

WebUI.click(findTestObject('header_setting/Page_SmartBar  Retailer Dashboard (1)/a_Admin'))

WebUI.waitForPageLoad(20, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('header_setting/Page_SmartBar  Retailer Dashboard (1)/select_LocationUserRegionPrice'), 
    'string:region', false)

WebUI.waitForPageLoad(20, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(15)

WebUI.setText(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard (1)/input_font-white form-control'), 
    region)

WebUI.sendKeys(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard (1)/input_font-white form-control'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(20, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('header_setting/Page_SmartBar  Retailer Dashboard (1)/a_Delete Region'))

WebUI.click(findTestObject('header_setting/Page_SmartBar  Retailer Dashboard (1)/button_Ok'))

WebUI.click(findTestObject('header_setting/Page_SmartBar  Retailer Dashboard (1)/div_Region Deleted succesfully'))

WebUI.waitForPageLoad(20, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('header_setting/Page_SmartBar  Retailer Dashboard (1)/img_img-circle'))

WebUI.click(findTestObject('header_setting/Page_SmartBar  Retailer Dashboard (1)/a_Logout'))

WebUI.closeBrowser()

