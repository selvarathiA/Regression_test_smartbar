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

WebUI.click(findTestObject('Region_creation_updation_deletion/Page_Welcome to SmartBar/button_Dont Allow'))

WebUI.setText(findTestObject('Region_creation_updation_deletion/Page_Welcome to SmartBar/input_useremail'), 'testdolly')

WebUI.setText(findTestObject('Region_creation_updation_deletion/Page_Welcome to SmartBar/input_userpassword'), 'password')

WebUI.click(findTestObject('Admin_create_user/Page_Welcome to SmartBar/span_Login'))

WebUI.delay(50)

WebUI.click(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard/a_Admin'))

WebUI.delay(25)

WebUI.selectOptionByValue(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard/select_LocationUserRegionPrice'), 
    'string:region', true)

WebUI.delay(50)

WebUI.setText(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard/input_name'), region)

WebUI.sendKeys(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard/input_font-white form-control (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(25)

WebUI.setText(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard/input_threshold'), '-10')

WebUI.click(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard/span_'))

WebUI.click(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard/a_Update'))

WebUI.click(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard/div_Region Updated succesfully'))

WebUI.delay(25)

WebUI.callTestCase(findTestCase('Test Cases/logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

