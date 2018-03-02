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

WebUI.click(findTestObject('Region_creation_updation_deletion/Page_Welcome to SmartBar/button_Dont Allow'))

WebUI.setText(findTestObject('Region_creation_updation_deletion/Page_Welcome to SmartBar/input_useremail'), 'testdolly')

WebUI.setText(findTestObject('Region_creation_updation_deletion/Page_Welcome to SmartBar/input_userpassword'), 'password')

WebUI.sendKeys(findTestObject('Region_creation_updation_deletion/Page_Welcome to SmartBar/input_userpassword'), Keys.chord(
        Keys.ENTER))

WebUI.delay(25)

WebUI.click(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard/a_Admin'))

WebUI.delay(25)

WebUI.selectOptionByValue(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard/select_LocationUserRegionPrice'), 
    'string:region', true)

WebUI.delay(25)

WebUI.click(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard/a_Add Region'))

WebUI.setText(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard/input_name'), region)

WebUI.click(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard/button_Create Region'))

WebUI.click(findTestObject('Region_creation_updation_deletion/Page_SmartBar  Retailer Dashboard/div_Region Added Successfully.'))

WebUI.delay(25)

WebUI.callTestCase(findTestCase('Test Cases/logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

