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

WebUI.setText(findTestObject('Region_creation_admin/Page_Welcome to SmartBar/input_useremail'), 'admin')

WebUI.setText(findTestObject('Region_creation_admin/Page_Welcome to SmartBar/input_userpassword'), 'password')

WebUI.click(findTestObject('Region_creation_admin/Page_Welcome to SmartBar/button_Dont Allow'))

WebUI.click(findTestObject('Region_creation_admin/Page_Welcome to SmartBar/button_Login'))

WebUI.delay(25)

WebUI.click(findTestObject('Region_creation_admin/Page_SmartBar  Admin Dashboard/a_nav-link nav-toggle'))

WebUI.click(findTestObject('Region_creation_admin/Page_SmartBar  Admin Dashboard/span_Retailer Settings'))

WebUI.selectOptionByValue(findTestObject('Region_creation_admin/Page_SmartBar  Admin Dashboard/select_LocationUserRegionPrice'), 
    'string:region', true)

WebUI.delay(25)

WebUI.click(findTestObject('Region_creation_admin/Page_SmartBar  Admin Dashboard/a_Add Region'))

WebUI.setText(findTestObject('Region_creation_admin/Page_SmartBar  Admin Dashboard/input_name'), 'Northwest')

WebUI.setText(findTestObject('Region_creation_admin/Page_SmartBar  Admin Dashboard/input_threshold'), '10')

WebUI.click(findTestObject('Region_creation_admin/Page_SmartBar  Admin Dashboard/button_Create Region'))

WebUI.click(findTestObject('Region_creation_admin/Page_SmartBar  Admin Dashboard/div_SuccessRegion Added Succes'))

WebUI.delay(25)

WebUI.click(findTestObject('Region_creation_admin/Page_SmartBar  Admin Dashboard/i_fa fa-angle-down'))

WebUI.click(findTestObject('Region_creation_admin/Page_SmartBar  Admin Dashboard/a_Logout'))

WebUI.closeBrowser()

