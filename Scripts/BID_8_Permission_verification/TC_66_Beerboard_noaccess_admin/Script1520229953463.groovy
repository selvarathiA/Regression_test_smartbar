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

WebUI.setText(findTestObject('BID_8_Permission_verification/Page_Welcome to SmartBar (1)/input_useremail'), 'admin')

WebUI.click(findTestObject('BID_8_Permission_verification/Page_Welcome to SmartBar (1)/button_Dont Allow'))

WebUI.setText(findTestObject('BID_8_Permission_verification/Page_Welcome to SmartBar (1)/input_userpassword'), 'password')

WebUI.click(findTestObject('BID_8_Permission_verification/Page_Welcome to SmartBar (1)/button_Login'))

WebUI.delay(30)

WebUI.click(findTestObject('BID_8_Permission_verification/Page_SmartBar  Admin Dashboard/a_nav-link nav-toggle'))

WebUI.delay(30)

WebUI.click(findTestObject('BID_8_Permission_verification/Page_SmartBar  Admin Dashboard/a_Update Access'))

WebUI.scrollToElement(findTestObject('BID_8_Permission_verification/Page_SmartBar  Admin Dashboard/h5_68 - Spritlepolicy'), 
    240)

WebUI.click(findTestObject('BID_8_Permission_verification/Page_SmartBar  Admin Dashboard/h5_68 - Spritlepolicy'))

WebUI.scrollToElement(findTestObject('BID_8_Permission_verification/Page_SmartBar  Admin Dashboard/a_Update Access'), 10)

WebUI.delay(30)

WebUI.doubleClick(findTestObject('BID_8_Permission_verification/beerboardtab/Page_SmartBar  Admin Dashboard/a_Beerboard Tab'))

WebUI.verifyElementChecked(findTestObject('BID_8_Permission_verification/beerboardtab/Page_SmartBar  Admin Dashboard/input_ng-pristine ng-untouched'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.uncheck(findTestObject('BID_8_Permission_verification/beerboardtab/Page_SmartBar  Admin Dashboard/input_ng-pristine ng-untouched'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('BID_8_Permission_verification/Page_SmartBar  Admin Dashboard/a_Update'), 50)

WebUI.click(findTestObject('BID_8_Permission_verification/Page_SmartBar  Admin Dashboard/a_Update'))

WebUI.click(findTestObject('BID_8_Permission_verification/Page_SmartBar  Admin Dashboard/div_User Policy Updated Succes'))

WebUI.delay(30)

WebUI.scrollToElement(findTestObject('BID_8_Permission_verification/Page_SmartBar  Admin Dashboard/i_fa fa-angle-down'), 
    10)

WebUI.click(findTestObject('BID_8_Permission_verification/Page_SmartBar  Admin Dashboard/i_fa fa-angle-down'))

WebUI.click(findTestObject('BID_8_Permission_verification/Page_SmartBar  Admin Dashboard/a_Logout'))

WebUI.closeBrowser()

