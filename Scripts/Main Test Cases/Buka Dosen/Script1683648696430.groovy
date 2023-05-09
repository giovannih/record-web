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

WebUI.navigateToUrl('https://www.ukdw.ac.id/')

WebUI.click(findTestObject('Object Repository/Page_UKDW  A New Breed of Professionals/span_Pilih Laman_mobile_menu_bar mobile_men_24b656'))

WebUI.click(findTestObject('Object Repository/Page_UKDW  A New Breed of Professionals/a_Akademik'))

WebUI.click(findTestObject('Object Repository/Page_UKDW  A New Breed of Professionals/a_Fakultas Teknologi Informasi'))

WebUI.click(findTestObject('Object Repository/Page_UKDW  A New Breed of Professionals/a_Program Sarjana'))

WebUI.click(findTestObject('Object Repository/Page_UKDW  A New Breed of Professionals/a_Sistem Informasi'))

WebUI.click(findTestObject('Object Repository/Page_Sistem Informasi  UKDW/h2_Argo Wibowo, S.T., MT'))

WebUI.getText(findTestObject('Page_Argo Wibowo, S.T., MT  UKDW/p_DosenSistem Informasi'))

WebUI.comment('Dosen Ditemukan')

WebUI.closeBrowser()

