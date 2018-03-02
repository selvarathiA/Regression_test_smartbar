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

WebUI.click(findTestObject('Policycreation/Page_Welcome to SmartBar/button_Dont Allow'))

WebUI.setText(findTestObject('Policycreation/Page_Welcome to SmartBar/input_useremail'), 'admin')

WebUI.setText(findTestObject('Policycreation/Page_Welcome to SmartBar/input_userpassword'), 'password')

WebUI.click(findTestObject('Policycreation/Page_Welcome to SmartBar/button_Login'))

WebUI.delay(25)

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/a_nav-link nav-toggle'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/a_Retailer Access Management'))

WebUI.delay(25)

WebUI.setText(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/input_name'), 'Spritlepolicy')

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/input_374'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/input_299'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/uib-tab-heading_Product Manage'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/uib-tab-heading_Product Reques'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/uib-tab-heading_Yield Tracker'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/uib-tab-heading_Campaign Repor'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/uib-tab-heading_Category  Styl'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/uib-tab-heading_Brand Share'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/uib-tab-heading_My Alert'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/uib-tab-heading_Beerboard Tab'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/uib-tab-heading_Tap Distributi'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/uib-tab-heading_Admin Tab'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/a_Others'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/a_Filter Management'))

WebUI.scrollToElement(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/a_Save'), 20)

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/a_Save'))

WebUI.click(findTestObject('Policycreation/Page_SmartBar  Admin Dashboard/div_New  User Policy 68 Create'))

WebUI.closeBrowser()

