import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.traveloka.com/id-id/')

WebUI.click(findTestObject('Object Repository/Page_Traveloka - Superapp Solusi Kebutuhan _8c6c9a/input_Dari_css-11aywtz r-13awgt0 r-1sixt3s _b48b29'))

WebUI.click(findTestObject('Object Repository/Page_Traveloka - Superapp Solusi Kebutuhan _8c6c9a/span_KNO - Kualanamu International Airport'))

WebUI.click(findTestObject('Object Repository/Page_Traveloka - Superapp Solusi Kebutuhan _8c6c9a/input_Ke_css-11aywtz r-13awgt0 r-1sixt3s r-_e1a161'))

WebUI.click(findTestObject('Object Repository/Page_Traveloka - Superapp Solusi Kebutuhan _8c6c9a/span_DPS - Ngurah Rai International Airport'))

WebUI.click(findTestObject('Page_Traveloka - Superapp Solusi Kebutuhan _8c6c9a/input_Tanggal Pergi_css-11aywtz r-1loqt21 r-13awgt0 r-1sixt3s r-ubezar r-135wba7 r-bcqeeo r-1ny4l3l r-10paoce r-13n6l4s'))

WebUI.click(findTestObject('Object Repository/Page_Traveloka - Superapp Solusi Kebutuhan _8c6c9a/div_9'))

WebUI.click(findTestObject('Object Repository/Page_Traveloka - Superapp Solusi Kebutuhan _8c6c9a/div_Cari Tiket'))

WebUI.closeBrowser()

