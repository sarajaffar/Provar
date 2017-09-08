	package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ContactScreen"                                
     , summary=""
     , relativeUrl=""
     , connection="JobScience"
     )             
public class ContactScreen {

	@TextType()
	@FindBy(id = "CF00Nw0000008kQW6_ileinner")
	public WebElement UK_Consultant;
	@TextType()
	@FindBy(xpath = "//input[@name=\"CF00Nw0000008kQW6\"]")
	public WebElement edit_ukconsultant;
	@LinkType()
	@FindBy(xpath = "//span[contains(@class, \"lookupInput\")]//a")
	public WebElement lookup_ukconsultant;
	@TextType()
	@FindBy(xpath = "//*[@id=\"00Nw0000008kZvH_ileinner\"]")
	public WebElement location;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "West Sussex"),
			@ChoiceListValue(value = "1", title = "Melbourne"), @ChoiceListValue(value = "2", title = "Haringey"),
			@ChoiceListValue(value = "3", title = "London Central"),
			@ChoiceListValue(value = "4", title = "East Sussex"),
			@ChoiceListValue(value = "5", title = "Home Counties"), @ChoiceListValue(value = "6", title = "Barnet"),
			@ChoiceListValue(value = "7", title = "Lewisham"), @ChoiceListValue(value = "8", title = "Greenwich"),
			@ChoiceListValue(value = "9", title = "Surrey"), @ChoiceListValue(value = "10", title = "Greater London"),
			@ChoiceListValue(value = "11", title = "Ireland"), @ChoiceListValue(value = "12", title = "Brisbane"),
			@ChoiceListValue(value = "13", title = "Hounslow"), @ChoiceListValue(value = "14", title = "Cheshire"),
			@ChoiceListValue(value = "15", title = "Western Australia"),
			@ChoiceListValue(value = "16", title = "Wandsworth"), @ChoiceListValue(value = "17", title = "Ealing"),
			@ChoiceListValue(value = "18", title = "Harrow"), @ChoiceListValue(value = "19", title = "Cambridgeshire"),
			@ChoiceListValue(value = "20", title = "City of London"),
			@ChoiceListValue(value = "21", title = "Hampshire"), @ChoiceListValue(value = "22", title = "Hillingdon"),
			@ChoiceListValue(value = "23", title = "Essex"), @ChoiceListValue(value = "24", title = "SPARE"),
			@ChoiceListValue(value = "25", title = "Hertfordshire"),
			@ChoiceListValue(value = "26", title = "Westminster"),
			@ChoiceListValue(value = "27", title = "Open United Kingdom"),
			@ChoiceListValue(value = "28", title = "Croydon"), @ChoiceListValue(value = "29", title = "Bexley"),
			@ChoiceListValue(value = "30", title = "Open Australia"),
			@ChoiceListValue(value = "31", title = "Kensington & Chelsea"),
			@ChoiceListValue(value = "32", title = "Toowoomba"), @ChoiceListValue(value = "33", title = "Queensland"),
			@ChoiceListValue(value = "34", title = "Camden"),
			@ChoiceListValue(value = "35", title = "Hammersmith & Fulham"),
			@ChoiceListValue(value = "36", title = "Islington"), @ChoiceListValue(value = "37", title = "Merton"),
			@ChoiceListValue(value = "38", title = "Southwark"), @ChoiceListValue(value = "39", title = "Kent"),
			@ChoiceListValue(value = "40", title = "East Anglia"),
			@ChoiceListValue(value = "41", title = "South Yorkshire"), @ChoiceListValue(value = "42", title = "Sydney"),
			@ChoiceListValue(value = "43", title = "Bristol"), @ChoiceListValue(value = "44", title = "Redbridge"),
			@ChoiceListValue(value = "45", title = "Bedfordshire"), @ChoiceListValue(value = "46", title = "Canada"),
			@ChoiceListValue(value = "47", title = "Manchester"), @ChoiceListValue(value = "48", title = "ACT"),
			@ChoiceListValue(value = "49", title = "Leicestershire"),
			@ChoiceListValue(value = "50", title = "Kingston Upon Thames"),
			@ChoiceListValue(value = "51", title = "Lambeth"), @ChoiceListValue(value = "52", title = "Tower Hamlets"),
			@ChoiceListValue(value = "53", title = "Brent"), @ChoiceListValue(value = "54", title = "Enfield"),
			@ChoiceListValue(value = "55", title = "Berkshire"),
			@ChoiceListValue(value = "56", title = "Brisbane - West"),
			@ChoiceListValue(value = "57", title = "Brisbane - North"),
			@ChoiceListValue(value = "58", title = "Brisbane - South"),
			@ChoiceListValue(value = "59", title = "Gold Coast"),
			@ChoiceListValue(value = "60", title = "North Queensland"),
			@ChoiceListValue(value = "61", title = "Scotland"),
			@ChoiceListValue(value = "62", title = "Unassigned London"),
			@ChoiceListValue(value = "63", title = "Sunshine Coast"),
			@ChoiceListValue(value = "64", title = "Australia"),
			@ChoiceListValue(value = "65", title = "Open New Zealand"),
			@ChoiceListValue(value = "66", title = "Merseyside"),
			@ChoiceListValue(value = "67", title = "Melbourne East"), @ChoiceListValue(value = "68", title = "Norfolk"),
			@ChoiceListValue(value = "69", title = "International"),
			@ChoiceListValue(value = "70", title = "Gloucestershire"),
			@ChoiceListValue(value = "71", title = "Northumberland"),
			@ChoiceListValue(value = "72", title = "Hong Kong"),
			@ChoiceListValue(value = "73", title = "Barking & Dagenham"),
			@ChoiceListValue(value = "74", title = "Bromley"), @ChoiceListValue(value = "75", title = "Hackney"),
			@ChoiceListValue(value = "76", title = "Tayside"), @ChoiceListValue(value = "77", title = "Leeds"),
			@ChoiceListValue(value = "78", title = "Cornwall"),
			@ChoiceListValue(value = "79", title = "Sydney - South"),
			@ChoiceListValue(value = "80", title = "Shropshire"), @ChoiceListValue(value = "81", title = "New Zealand"),
			@ChoiceListValue(value = "82", title = "New Zealand - South Island"),
			@ChoiceListValue(value = "83", title = "Brisbane - East"),
			@ChoiceListValue(value = "84", title = "Oxfordshire"),
			@ChoiceListValue(value = "85", title = "Birmingham ( UK )"),
			@ChoiceListValue(value = "86", title = "Lancashire"),
			@ChoiceListValue(value = "87", title = "Open Victoria"),
			@ChoiceListValue(value = "88", title = "Greater Manchester"),
			@ChoiceListValue(value = "89", title = "West End"),
			@ChoiceListValue(value = "90", title = "New South Wales"),
			@ChoiceListValue(value = "91", title = "NSW - Regional"),
			@ChoiceListValue(value = "92", title = "South East Queensland"),
			@ChoiceListValue(value = "93", title = "Townsville"),
			@ChoiceListValue(value = "94", title = "Sydney - West"),
			@ChoiceListValue(value = "95", title = "New Zealand - North Island"),
			@ChoiceListValue(value = "96", title = "Northern Territory"),
			@ChoiceListValue(value = "97", title = "Sydney - North"),
			@ChoiceListValue(value = "98", title = "Open Canada"),
			@ChoiceListValue(value = "99", title = "Unassigned UK"),
			@ChoiceListValue(value = "100", title = "Midlands"),
			@ChoiceListValue(value = "101", title = "Central Quuensland"),
			@ChoiceListValue(value = "102", title = "Buckinghamshire"),
			@ChoiceListValue(value = "103", title = "Central Coast"),
			@ChoiceListValue(value = "104", title = "Brighton"), @ChoiceListValue(value = "105", title = "Cairns"),
			@ChoiceListValue(value = "106", title = "Sydney - East"),
			@ChoiceListValue(value = "107", title = "Suffolk"), @ChoiceListValue(value = "108", title = "NSW - Orange"),
			@ChoiceListValue(value = "109", title = "Newcastle Region"),
			@ChoiceListValue(value = "110", title = "Rockhampton"), @ChoiceListValue(value = "111", title = "Surbiton"),
			@ChoiceListValue(value = "112", title = "Durham"),
			@ChoiceListValue(value = "113", title = "Nottinghamshire"),
			@ChoiceListValue(value = "114", title = "NSW - Wagga Wagga"),
			@ChoiceListValue(value = "115", title = "Southampton"),
			@ChoiceListValue(value = "116", title = "Derbyshire"), @ChoiceListValue(value = "117", title = "Devon"),
			@ChoiceListValue(value = "118", title = "Sutton"),
			@ChoiceListValue(value = "119", title = "West Yorkshire"),
			@ChoiceListValue(value = "120", title = "Southern Australia"),
			@ChoiceListValue(value = "121", title = "Wiltshire"), @ChoiceListValue(value = "122", title = "Newham"),
			@ChoiceListValue(value = "123", title = "Richmond Upon Thames"),
			@ChoiceListValue(value = "124", title = "Newcastle Upon Tyne"),
			@ChoiceListValue(value = "125", title = "NSW - Armidale"),
			@ChoiceListValue(value = "126", title = "Somerset"),
			@ChoiceListValue(value = "127", title = "Waltham Forest"),
			@ChoiceListValue(value = "128", title = "Lincolnshire"),
			@ChoiceListValue(value = "129", title = "Liverpool"),
			@ChoiceListValue(value = "130", title = "North Yorkshire"),
			@ChoiceListValue(value = "131", title = "Perth"), @ChoiceListValue(value = "132", title = "Staffordshire"),
			@ChoiceListValue(value = "133", title = "Melbourne West"),
			@ChoiceListValue(value = "134", title = "Cumbria"), @ChoiceListValue(value = "135", title = "Wollongong"),
			@ChoiceListValue(value = "136", title = "Warwickshire"), @ChoiceListValue(value = "137", title = "Wales"),
			@ChoiceListValue(value = "138", title = "Dumfries & Galloway"),
			@ChoiceListValue(value = "139", title = "Coffs Harbour"),
			@ChoiceListValue(value = "140", title = "VIC Geelong District"),
			@ChoiceListValue(value = "141", title = "Havering"), @ChoiceListValue(value = "142", title = "Humberside"),
			@ChoiceListValue(value = "143", title = "VIC - Regional - North"),
			@ChoiceListValue(value = "144", title = "VIC Regional - East"),
			@ChoiceListValue(value = "145", title = "Mackay"), @ChoiceListValue(value = "146", title = "Northampton"),
			@ChoiceListValue(value = "147", title = "Melbourne North"),
			@ChoiceListValue(value = "148", title = "Tasmania"), @ChoiceListValue(value = "149", title = "Sth West"),
			@ChoiceListValue(value = "150", title = "Middle East"),
			@ChoiceListValue(value = "151", title = "VIC Regional - West"),
			@ChoiceListValue(value = "152", title = "Melbourne South"),
			@ChoiceListValue(value = "153", title = "Wide Bay Region"),
			@ChoiceListValue(value = "154", title = "VIC Regional - South"),
			@ChoiceListValue(value = "155", title = "Canberra"),
			@ChoiceListValue(value = "156", title = "Hills District"),
			@ChoiceListValue(value = "157", title = "Bundaberg"), @ChoiceListValue(value = "158", title = "Sth Coast"),
			@ChoiceListValue(value = "159", title = "Dorset"), @ChoiceListValue(value = "160", title = "Bathurst"),
			@ChoiceListValue(value = "161", title = "NSW - Dubbo"), @ChoiceListValue(value = "162", title = "Wagga"),
			@ChoiceListValue(value = "163", title = "Gladstone"),
			@ChoiceListValue(value = "164", title = "NSW - Tamworth"),
			@ChoiceListValue(value = "165", title = "Armidale"),
			@ChoiceListValue(value = "166", title = "NSW - Wollongong"),
			@ChoiceListValue(value = "167", title = "Isle of Wight"), @ChoiceListValue(value = "168", title = "Kuwait"),
			@ChoiceListValue(value = "169", title = "Hunter"),
			@ChoiceListValue(value = "170", title = "Penrith Region"),
			@ChoiceListValue(value = "171", title = "North West"),
			@ChoiceListValue(value = "172", title = "Hunter Region"),
			@ChoiceListValue(value = "173", title = "Sth Highlands"),
			@ChoiceListValue(value = "174", title = "Bega Valley"),
			@ChoiceListValue(value = "175", title = "Northern Beaches"),
			@ChoiceListValue(value = "176", title = "Campbelltown"),
			@ChoiceListValue(value = "177", title = "Hereford"), @ChoiceListValue(value = "178", title = "Cambridge"),
			@ChoiceListValue(value = "179", title = "Oxford"), @ChoiceListValue(value = "180", title = "Lothian"),
			@ChoiceListValue(value = "181", title = "Cleveland"), @ChoiceListValue(value = "182", title = "Reading"),
			@ChoiceListValue(value = "183", title = "South West Sydney"),
			@ChoiceListValue(value = "184", title = "Gwynedd"), @ChoiceListValue(value = "185", title = "North Coast"),
			@ChoiceListValue(value = "186", title = "Dubbo"), @ChoiceListValue(value = "187", title = "Blacktown"),
			@ChoiceListValue(value = "188", title = "Parramatta Region"),
			@ChoiceListValue(value = "189", title = "Mount Isa"),
			@ChoiceListValue(value = "190", title = "Worcester") })
	@FindBy(xpath = "//*[@id=\"00Nw0000008kZvH_unselected\"]//option[1]")
	public WebElement west;
	@TextType()
	@FindBy(xpath = "//*[@id=\"00Nw0000008kZvH_ileinner\"]")
	public WebElement location1;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "West Sussex"),
			@ChoiceListValue(value = "1", title = "Melbourne"), @ChoiceListValue(value = "2", title = "Haringey"),
			@ChoiceListValue(value = "3", title = "London Central"),
			@ChoiceListValue(value = "4", title = "East Sussex"),
			@ChoiceListValue(value = "5", title = "Home Counties"), @ChoiceListValue(value = "6", title = "Barnet"),
			@ChoiceListValue(value = "7", title = "Lewisham"), @ChoiceListValue(value = "8", title = "Greenwich"),
			@ChoiceListValue(value = "9", title = "Surrey"), @ChoiceListValue(value = "10", title = "Greater London"),
			@ChoiceListValue(value = "11", title = "Ireland"), @ChoiceListValue(value = "12", title = "Brisbane"),
			@ChoiceListValue(value = "13", title = "Hounslow"), @ChoiceListValue(value = "14", title = "Cheshire"),
			@ChoiceListValue(value = "15", title = "Western Australia"),
			@ChoiceListValue(value = "16", title = "Wandsworth"), @ChoiceListValue(value = "17", title = "Ealing"),
			@ChoiceListValue(value = "18", title = "Harrow"), @ChoiceListValue(value = "19", title = "Cambridgeshire"),
			@ChoiceListValue(value = "20", title = "City of London"),
			@ChoiceListValue(value = "21", title = "Hampshire"), @ChoiceListValue(value = "22", title = "Hillingdon"),
			@ChoiceListValue(value = "23", title = "Essex"), @ChoiceListValue(value = "24", title = "SPARE"),
			@ChoiceListValue(value = "25", title = "Hertfordshire"),
			@ChoiceListValue(value = "26", title = "Westminster"),
			@ChoiceListValue(value = "27", title = "Open United Kingdom"),
			@ChoiceListValue(value = "28", title = "Croydon"), @ChoiceListValue(value = "29", title = "Bexley"),
			@ChoiceListValue(value = "30", title = "Open Australia"),
			@ChoiceListValue(value = "31", title = "Kensington & Chelsea"),
			@ChoiceListValue(value = "32", title = "Toowoomba"), @ChoiceListValue(value = "33", title = "Queensland"),
			@ChoiceListValue(value = "34", title = "Camden"),
			@ChoiceListValue(value = "35", title = "Hammersmith & Fulham"),
			@ChoiceListValue(value = "36", title = "Islington"), @ChoiceListValue(value = "37", title = "Merton"),
			@ChoiceListValue(value = "38", title = "Southwark"), @ChoiceListValue(value = "39", title = "Kent"),
			@ChoiceListValue(value = "40", title = "East Anglia"),
			@ChoiceListValue(value = "41", title = "South Yorkshire"), @ChoiceListValue(value = "42", title = "Sydney"),
			@ChoiceListValue(value = "43", title = "Bristol"), @ChoiceListValue(value = "44", title = "Redbridge"),
			@ChoiceListValue(value = "45", title = "Bedfordshire"), @ChoiceListValue(value = "46", title = "Canada"),
			@ChoiceListValue(value = "47", title = "Manchester"), @ChoiceListValue(value = "48", title = "ACT"),
			@ChoiceListValue(value = "49", title = "Leicestershire"),
			@ChoiceListValue(value = "50", title = "Kingston Upon Thames"),
			@ChoiceListValue(value = "51", title = "Lambeth"), @ChoiceListValue(value = "52", title = "Tower Hamlets"),
			@ChoiceListValue(value = "53", title = "Brent"), @ChoiceListValue(value = "54", title = "Enfield"),
			@ChoiceListValue(value = "55", title = "Berkshire"),
			@ChoiceListValue(value = "56", title = "Brisbane - West"),
			@ChoiceListValue(value = "57", title = "Brisbane - North"),
			@ChoiceListValue(value = "58", title = "Brisbane - South"),
			@ChoiceListValue(value = "59", title = "Gold Coast"),
			@ChoiceListValue(value = "60", title = "North Queensland"),
			@ChoiceListValue(value = "61", title = "Scotland"),
			@ChoiceListValue(value = "62", title = "Unassigned London"),
			@ChoiceListValue(value = "63", title = "Sunshine Coast"),
			@ChoiceListValue(value = "64", title = "Australia"),
			@ChoiceListValue(value = "65", title = "Open New Zealand"),
			@ChoiceListValue(value = "66", title = "Merseyside"),
			@ChoiceListValue(value = "67", title = "Melbourne East"), @ChoiceListValue(value = "68", title = "Norfolk"),
			@ChoiceListValue(value = "69", title = "International"),
			@ChoiceListValue(value = "70", title = "Gloucestershire"),
			@ChoiceListValue(value = "71", title = "Northumberland"),
			@ChoiceListValue(value = "72", title = "Hong Kong"),
			@ChoiceListValue(value = "73", title = "Barking & Dagenham"),
			@ChoiceListValue(value = "74", title = "Bromley"), @ChoiceListValue(value = "75", title = "Hackney"),
			@ChoiceListValue(value = "76", title = "Tayside"), @ChoiceListValue(value = "77", title = "Leeds"),
			@ChoiceListValue(value = "78", title = "Cornwall"),
			@ChoiceListValue(value = "79", title = "Sydney - South"),
			@ChoiceListValue(value = "80", title = "Shropshire"), @ChoiceListValue(value = "81", title = "New Zealand"),
			@ChoiceListValue(value = "82", title = "New Zealand - South Island"),
			@ChoiceListValue(value = "83", title = "Brisbane - East"),
			@ChoiceListValue(value = "84", title = "Oxfordshire"),
			@ChoiceListValue(value = "85", title = "Birmingham ( UK )"),
			@ChoiceListValue(value = "86", title = "Lancashire"),
			@ChoiceListValue(value = "87", title = "Open Victoria"),
			@ChoiceListValue(value = "88", title = "Greater Manchester"),
			@ChoiceListValue(value = "89", title = "West End"),
			@ChoiceListValue(value = "90", title = "New South Wales"),
			@ChoiceListValue(value = "91", title = "NSW - Regional"),
			@ChoiceListValue(value = "92", title = "South East Queensland"),
			@ChoiceListValue(value = "93", title = "Townsville"),
			@ChoiceListValue(value = "94", title = "Sydney - West"),
			@ChoiceListValue(value = "95", title = "New Zealand - North Island"),
			@ChoiceListValue(value = "96", title = "Northern Territory"),
			@ChoiceListValue(value = "97", title = "Sydney - North"),
			@ChoiceListValue(value = "98", title = "Open Canada"),
			@ChoiceListValue(value = "99", title = "Unassigned UK"),
			@ChoiceListValue(value = "100", title = "Midlands"),
			@ChoiceListValue(value = "101", title = "Central Quuensland"),
			@ChoiceListValue(value = "102", title = "Buckinghamshire"),
			@ChoiceListValue(value = "103", title = "Central Coast"),
			@ChoiceListValue(value = "104", title = "Brighton"), @ChoiceListValue(value = "105", title = "Cairns"),
			@ChoiceListValue(value = "106", title = "Sydney - East"),
			@ChoiceListValue(value = "107", title = "Suffolk"), @ChoiceListValue(value = "108", title = "NSW - Orange"),
			@ChoiceListValue(value = "109", title = "Newcastle Region"),
			@ChoiceListValue(value = "110", title = "Rockhampton"), @ChoiceListValue(value = "111", title = "Surbiton"),
			@ChoiceListValue(value = "112", title = "Durham"),
			@ChoiceListValue(value = "113", title = "Nottinghamshire"),
			@ChoiceListValue(value = "114", title = "NSW - Wagga Wagga"),
			@ChoiceListValue(value = "115", title = "Southampton"),
			@ChoiceListValue(value = "116", title = "Derbyshire"), @ChoiceListValue(value = "117", title = "Devon"),
			@ChoiceListValue(value = "118", title = "Sutton"),
			@ChoiceListValue(value = "119", title = "West Yorkshire"),
			@ChoiceListValue(value = "120", title = "Southern Australia"),
			@ChoiceListValue(value = "121", title = "Wiltshire"), @ChoiceListValue(value = "122", title = "Newham"),
			@ChoiceListValue(value = "123", title = "Richmond Upon Thames"),
			@ChoiceListValue(value = "124", title = "Newcastle Upon Tyne"),
			@ChoiceListValue(value = "125", title = "NSW - Armidale"),
			@ChoiceListValue(value = "126", title = "Somerset"),
			@ChoiceListValue(value = "127", title = "Waltham Forest"),
			@ChoiceListValue(value = "128", title = "Lincolnshire"),
			@ChoiceListValue(value = "129", title = "Liverpool"),
			@ChoiceListValue(value = "130", title = "North Yorkshire"),
			@ChoiceListValue(value = "131", title = "Perth"), @ChoiceListValue(value = "132", title = "Staffordshire"),
			@ChoiceListValue(value = "133", title = "Melbourne West"),
			@ChoiceListValue(value = "134", title = "Cumbria"), @ChoiceListValue(value = "135", title = "Wollongong"),
			@ChoiceListValue(value = "136", title = "Warwickshire"), @ChoiceListValue(value = "137", title = "Wales"),
			@ChoiceListValue(value = "138", title = "Dumfries & Galloway"),
			@ChoiceListValue(value = "139", title = "Coffs Harbour"),
			@ChoiceListValue(value = "140", title = "VIC Geelong District"),
			@ChoiceListValue(value = "141", title = "Havering"), @ChoiceListValue(value = "142", title = "Humberside"),
			@ChoiceListValue(value = "143", title = "VIC - Regional - North"),
			@ChoiceListValue(value = "144", title = "VIC Regional - East"),
			@ChoiceListValue(value = "145", title = "Mackay"), @ChoiceListValue(value = "146", title = "Northampton"),
			@ChoiceListValue(value = "147", title = "Melbourne North"),
			@ChoiceListValue(value = "148", title = "Tasmania"), @ChoiceListValue(value = "149", title = "Sth West"),
			@ChoiceListValue(value = "150", title = "Middle East"),
			@ChoiceListValue(value = "151", title = "VIC Regional - West"),
			@ChoiceListValue(value = "152", title = "Melbourne South"),
			@ChoiceListValue(value = "153", title = "Wide Bay Region"),
			@ChoiceListValue(value = "154", title = "VIC Regional - South"),
			@ChoiceListValue(value = "155", title = "Canberra"),
			@ChoiceListValue(value = "156", title = "Hills District"),
			@ChoiceListValue(value = "157", title = "Bundaberg"), @ChoiceListValue(value = "158", title = "Sth Coast"),
			@ChoiceListValue(value = "159", title = "Dorset"), @ChoiceListValue(value = "160", title = "Bathurst"),
			@ChoiceListValue(value = "161", title = "NSW - Dubbo"), @ChoiceListValue(value = "162", title = "Wagga"),
			@ChoiceListValue(value = "163", title = "Gladstone"),
			@ChoiceListValue(value = "164", title = "NSW - Tamworth"),
			@ChoiceListValue(value = "165", title = "Armidale"),
			@ChoiceListValue(value = "166", title = "NSW - Wollongong"),
			@ChoiceListValue(value = "167", title = "Isle of Wight"), @ChoiceListValue(value = "168", title = "Kuwait"),
			@ChoiceListValue(value = "169", title = "Hunter"),
			@ChoiceListValue(value = "170", title = "Penrith Region"),
			@ChoiceListValue(value = "171", title = "North West"),
			@ChoiceListValue(value = "172", title = "Hunter Region"),
			@ChoiceListValue(value = "173", title = "Sth Highlands"),
			@ChoiceListValue(value = "174", title = "Bega Valley"),
			@ChoiceListValue(value = "175", title = "Northern Beaches"),
			@ChoiceListValue(value = "176", title = "Campbelltown"),
			@ChoiceListValue(value = "177", title = "Hereford"), @ChoiceListValue(value = "178", title = "Cambridge"),
			@ChoiceListValue(value = "179", title = "Oxford"), @ChoiceListValue(value = "180", title = "Lothian"),
			@ChoiceListValue(value = "181", title = "Cleveland"), @ChoiceListValue(value = "182", title = "Reading"),
			@ChoiceListValue(value = "183", title = "South West Sydney"),
			@ChoiceListValue(value = "184", title = "Gwynedd"), @ChoiceListValue(value = "185", title = "North Coast"),
			@ChoiceListValue(value = "186", title = "Dubbo"), @ChoiceListValue(value = "187", title = "Blacktown"),
			@ChoiceListValue(value = "188", title = "Parramatta Region"),
			@ChoiceListValue(value = "189", title = "Mount Isa"),
			@ChoiceListValue(value = "190", title = "Worcester") })
	
	@FindBy(xpath = "//select[contains(@id,\"unselected\")]")
	public WebElement PreferredLoc;
	@LinkType()
	@FindBy(xpath = "//td[contains(@class, \"multiSelectPicklistCell\")]//a[1]")
	public WebElement AddArrow;			
}