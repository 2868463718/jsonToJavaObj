package com.elccep.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.elccep.common.enity.JavaObj;
import com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.ProgramList;
import com.elccep.common.model.handlers.Handler;
import com.elccep.common.model.helpers.MyProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootTest
class CommonApplicationTests {
    @Autowired
    private  Environment environment;
    String str="";
    String str1="";
    String str2="";
    String str3="";

    {
        str3="{\n" +
                "    \"SourceSystem\": [\n" +
                "        {\n" +
                "            \"@Code\": \"undchnundrtlpround\",\n" +
                "            \"SourceTimestamp\": \"2019-02-11T12:00:00\",\n" +
                "            \"AffiliateCode\": \"CHN\",\n" +
                "            \"MarketCode\": \"CHN\",\n" +
                "            \"DivisionCode\": \"01\",\n" +
                "            \"BrandCode\": \"01\",\n" +
                "            \"ConsumerId\": \"1210\",\n" +
                "            \"TerminaId\": \"1210\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        str2=" {\n" +
                "        \"@Action\": \"Create\",\n" +
                "        \"DocumentTimestamp\": \"2019-02-14T09:58:07\",\n" +
                "        \"DocumentUUID\": \"1e95f083-a411-4afc-9656-0274b655b776\"\n" +
                "    }";
        str="{\n" +
                "    \"Header\": {\n" +
                "        \"@Action\": \"CREATE\",\n" +
                "        \"DocumentTimestamp\": \"2020-07-29T16:24:27Z\",\n" +
                "        \"DocumentUUID\": \"517f78f3-89b1-4efb-848b-797fd0d6b906\"\n" +
                "    },\n" +
                "    \"ConsumerBestRecord\": {\n" +
                "        \"@RecordUUID\": \"cfc7bef7-f53f-45a6-ad1d-a106afa255fa\",\n" +
                "        \"BestRecord\": {\n" +
                "            \"SourceSystemList\": {\n" +
                "                \"SourceSystem\": [\n" +
                "                    {\n" +
                "                        \"@Code\": \"undausundcbiund\",\n" +
                "                        \"SourceTimestamp\": \"2014-05-06T00:00:00Z\",\n" +
                "                        \"AffiliateCode\": \"CHN\",\n" +
                "                        \"MarketCode\": \"AUS\",\n" +
                "                        \"DivisionCode\": \"01\",\n" +
                "                        \"BrandCode\": \"11\",\n" +
                "                        \"ConsumerId\": \"44610\",\n" +
                "                        \"TerminalId\": \"1210\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"Attributes\": {\n" +
                "                \"RecordTimestamp\": \"2020-07-29T16:03:52Z\",\n" +
                "                \"SourceTimestamp\": \"2017-04-06T00:00:00Z\",\n" +
                "                \"CSRInstanceCode\": \"csrcdpapc\",\n" +
                "                \"CSRInstanceDescription\": \"CSR CDP — APAC\",\n" +
                "                \"UniversalKey\": \"ffc91d39-73d4-4010-86e4-f778d93342bd\",\n" +
                "                \"RecognitionServiceCode\": \"cnsmtlndmdm\"\n" +
                "            },\n" +
                "            \"PersonalData\": {\n" +
                "                \"RegDate\": \"2014-05-06T00:00:00Z\",\n" +
                "                \"RegTouchPointSourceSystem\": {\n" +
                "                    \"SourceTimestamp\": \"2014-05-06T00:00:00Z\",\n" +
                "                    \"AffiliateCode\": \"CHN\",\n" +
                "                    \"MarketCode\": \"AUS\",\n" +
                "                    \"DivisionCode\": \"CHN\",\n" +
                "                    \"BrandCode\": \"01\",\n" +
                "                    \"TouchPointCode\": \"321354\"\n" +
                "                },\n" +
                "                \"LastUpdateTouchPointSourceSystem\": {\n" +
                "                    \"SourceTimestamp\": \"2017-04-06T00:00:00Z\",\n" +
                "                    \"AffiliateCode\": \"AUS\",\n" +
                "                    \"MarketCode\": \"AUS\",\n" +
                "                    \"DivisionCode\": \"AUS\",\n" +
                "                    \"BrandCode\": \"01\",\n" +
                "                    \"TouchPointCode\": \"321354\"\n" +
                "                },\n" +
                "                \"RegPersonnelSourceSystem\": {\n" +
                "                    \"SourceTimestamp\": \"2019-01-07 17:25:21.0\",\n" +
                "                    \"AffiliateCode\": \"AUS\",\n" +
                "                    \"MarketCode\": \"AUS\",\n" +
                "                    \"DivisionCode\": \"01\",\n" +
                "                    \"BrandCode\": \"1\",\n" +
                "                    \"PersonnelCode\": \"43\"\n" +
                "                },\n" +
                "                \"EformRegFlag\": true,\n" +
                "                \"NameGenderCode\": \"fml\",\n" +
                "                \"GenderCode\": \"fml\",\n" +
                "                \"CivilStatusCode\": \"mrr\",\n" +
                "                \"ConsumerCountryCode_ISO3\": \"CHN\",\n" +
                "                \"SpokenLanguageCode\": \"eng\",\n" +
                "                \"WrittenLanguageCode\": \"englatn\",\n" +
                "                \"BirthDay\": 20,\n" +
                "                \"BirthMonth\": 1,\n" +
                "                \"BirthYear\": 1987,\n" +
                "                \"EstimatedBirthYear\": 1987,\n" +
                "                \"NameFilledFlag\": true\n" +
                "            },\n" +
                "            \"ProgramList\": {\n" +
                "                \"Program\": [\n" +
                "                    {\n" +
                "                        \"ApplicationTouchPointCode\": \"23\",\n" +
                "                        \"ConsumerGroup\": \"High Valued Consumer\",\n" +
                "                        \"ProgramTypeCode\": \"chn01rntclb\",\n" +
                "                        \"ProgramTypeDescription\": \"China / Estēe Lauder — Re-Nutriv Club\",\n" +
                "                        \"ProgramLevelCode\": \"chn01rntclb\",\n" +
                "                        \"ProgramLevelDescription\": \"China / Estēe Lauder — Re-Nutriv Club\",\n" +
                "                        \"ProgramSystemIDCode\": \"chn01rntclb\",\n" +
                "                        \"ProgramSystemIDDescription\": \"China / Estēe Lauder — Re-Nutriv Club\",\n" +
                "                        \"MembershipNum\": \"121012101210\",\n" +
                "                        \"CardNum\": \"121012101210\",\n" +
                "                        \"StartTimestamp\": \"2019-02-11T12:00:00\",\n" +
                "                        \"EndTimestamp\": \"2020-02-11T12:00:00\",\n" +
                "                        \"PointsAcquired\": \"150\",\n" +
                "                        \"PointsRedeemed\": \"100\",\n" +
                "                        \"InitialQuota\": \"150\",\n" +
                "                        \"AvailableQuota\": \"50\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"CustomAttributeList\": {\n" +
                "                \"CustomAttribute\": [\n" +
                "                    {\n" +
                "                        \"@Name\": \"CustomerId\",\n" +
                "                        \"@Value\": \"1210\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"@Name\": \"Skintype\",\n" +
                "                        \"@Value\": \"Dry\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"CalculatedBusinessVariables\": {\n" +
                "                \"Segment\": {\n" +
                "                    \"@Code\": \"\",\n" +
                "                    \"Description\": \"\"\n" +
                "                },\n" +
                "                \"Decile\": 12,\n" +
                "                \"ValueGroup\": {\n" +
                "                    \"@Code\": \"\",\n" +
                "                    \"Description\": \"\"\n" +
                "                },\n" +
                "                \"RecencySegment\": {\n" +
                "                    \"@Code\": \"\",\n" +
                "                    \"Description\": \"\",\n" +
                "                    \"Active\": true\n" +
                "                },\n" +
                "                \"PurchaseSummary\": {\n" +
                "                    \"TotalPurchaseNumber\": 12,\n" +
                "                    \"R12MPurchaseNumber\": 12,\n" +
                "                    \"Currency\": {\n" +
                "                        \"CurrencyCode\": \"asd\"\n" +
                "                    },\n" +
                "                    \"GrossRevenueNoVAT\": 12.12,\n" +
                "                    \"GrossRevenueVAT\": 12.23,\n" +
                "                    \"NetRevenueNoVAT\": 12.14,\n" +
                "                    \"NetRevenueVAT\": 12.13\n" +
                "                }\n" +
                "            }\n" +
                "        },\n" +
                "        \"DerivedBestRecordList\": {\n" +
                "            \"DerivedBestRecord\": [\n" +
                "                {\n" +
                "                    \"@Level\": \"2\",\n" +
                "                    \"SourceSystemList\": {\n" +
                "                        \"SourceSystem\": [\n" +
                "                            {\n" +
                "                                \"@Code\": \"undchnundrtlpround\",\n" +
                "                                \"SourceTimestamp\": \"2019-02-11T12:00:00\",\n" +
                "                                \"AffiliateCode\": \"CHN\",\n" +
                "                                \"MarketCode\": \"CHN\",\n" +
                "                                \"DivisionCode\": \"01\",\n" +
                "                                \"BrandCode\": \"01\",\n" +
                "                                \"ConsumerId\": \"1210\",\n" +
                "                                \"TerminaId\": \"1210\"\n" +
                "                            }\n" +
                "                        ]\n" +
                "                    },\n" +
                "                    \"Attributes\": {\n" +
                "                        \"RecordTimestamp\": \"2020-07-29T16:07:48Z\",\n" +
                "                        \"SourceTimestamp\": \"2017-04-06T00:00:00Z\",\n" +
                "                        \"MarketCode\": \"AUS\",\n" +
                "                        \"BrandCode\": \"01\",\n" +
                "                        \"RetailerHierarchyCode\": \"01\",\n" +
                "                        \"TouchPointCode\": \"01\"\n" +
                "                    },\n" +
                "                    \"PersonalData\": {\n" +
                "                        \"RegDate\": \"2017-04-06T00:00:00Z\",\n" +
                "                        \"RegTouchPointSourceSystem\": {\n" +
                "                            \"SourceTimestamp\": \"2017-04-06T00:00:00Z\",\n" +
                "                            \"AffiliateCode\": \"CHN\",\n" +
                "                            \"MarketCode\": \"AUS\",\n" +
                "                            \"DivisionCode\": \"CHN\",\n" +
                "                            \"BrandCode\": \"01\",\n" +
                "                            \"TouchPointCode\": \"321354\"\n" +
                "                        },\n" +
                "                        \"LastUpdateTouchPointSourceSystem\": {\n" +
                "                            \"SourceTimestamp\": \"2017-04-06T00:00:00Z\",\n" +
                "                            \"AffiliateCode\": \"AUS\",\n" +
                "                            \"MarketCode\": \"AUS\",\n" +
                "                            \"DivisionCode\": \"AUS\",\n" +
                "                            \"BrandCode\": \"01\",\n" +
                "                            \"TouchPointCode\": \"321354\"\n" +
                "                        },\n" +
                "                        \"RegPersonnelSourceSystem\": {\n" +
                "                            \"@Code\": \"undchnundrtlpround\",\n" +
                "                            \"SourceTimestamp\": \"2019-02-11T12:00:00\",\n" +
                "                            \"AffiliateCode\": \"CHN\",\n" +
                "                            \"MarketCode\": \"CHN\",\n" +
                "                            \"DivisionCode\": \"01\",\n" +
                "                            \"BrandCode\": \"01\",\n" +
                "                            \"PersonnelCode\": \"23\"\n" +
                "                        },\n" +
                "                        \"NameGenderCode\": \"fml\",\n" +
                "                        \"GenderCode\": \"fml\",\n" +
                "                        \"CivilStatusCode\": \"fml\",\n" +
                "                        \"ConsumerCountryCode_ISO3\": \"fml\",\n" +
                "                        \"SpokenLanguageCode\": \"fml\",\n" +
                "                        \"WrittenLanguageCode\": \"fml\",\n" +
                "                        \"BirthDay\": 23,\n" +
                "                        \"BirthMonth\": 1,\n" +
                "                        \"BirthYear\": 2001,\n" +
                "                        \"EstimatedBirthYear\": 2001,\n" +
                "                        \"NameFilledFlag\": true,\n" +
                "                        \"Salutation\": \"Ms\",\n" +
                "                        \"LocalFirstName\": \"Carmen\",\n" +
                "                        \"LocalMiddleName\": \"Ms\",\n" +
                "                        \"LocalLastName\": \"Tu\",\n" +
                "                        \"LocalFullName\": \"Ms\",\n" +
                "                        \"LocalFirstName2\": \"Ms\",\n" +
                "                        \"LocalMiddleName2\": \"Ms\",\n" +
                "                        \"LocalLastName2\": \"Ms\",\n" +
                "                        \"LocalFullName2\": \"Ms\",\n" +
                "                        \"EnglishFirstName\": \"Ms\",\n" +
                "                        \"EnglishMiddleName\": \"Ms\",\n" +
                "                        \"EnglishLastName\": \"Ms\",\n" +
                "                        \"EnglishFullName\": \"Ms\",\n" +
                "                        \"IdentityNum\": \"101010101010\",\n" +
                "                        \"PassportNum\": \"101010101010\",\n" +
                "                        \"SocialSecurityNum\": \"101010101010\",\n" +
                "                        \"Company\": \"Company 1\",\n" +
                "                        \"Department\": \"Company 1\",\n" +
                "                        \"JobTitle\": \"Company 1\",\n" +
                "                        \"YearlyIncome\": \"190090.00\",\n" +
                "                        \"SkinType\": {\n" +
                "                            \"BrandCode\": \"01\",\n" +
                "                            \"SkinTypeCode\": \"01\"\n" +
                "                        },\n" +
                "                        \"Currency\": {\n" +
                "                            \"CurrencyCode\": \"USD\"\n" +
                "                        },\n" +
                "                        \"Ethnicity\": {\n" +
                "                            \"MarketCode\": \"CHN\",\n" +
                "                            \"EthnicityCode\": \"chn\"\n" +
                "                        },\n" +
                "                        \"ConsumerClassCode\": \"chn\",\n" +
                "                        \"PreferredTouchPointCodeSourceSystem\": {\n" +
                "                            \"SourceTimestamp\": \"2019-02-11T12:00:00\",\n" +
                "                            \"AffiliateCode\": \"CHN\",\n" +
                "                            \"MarketCode\": \"CHN\",\n" +
                "                            \"DivisionCode\": \"CHN\",\n" +
                "                            \"BrandCode\": \"CHN\",\n" +
                "                            \"TouchPointCode\": \"CHN\"\n" +
                "                        },\n" +
                "                        \"LastVisitTouchPointCodeSourceSystem\": {\n" +
                "                            \"SourceTimestamp\": \"2019-02-12T12:00:00\",\n" +
                "                            \"MarketCode\": \"CHN\",\n" +
                "                            \"BrandCode\": \"01\",\n" +
                "                            \"TouchPointCode\": \"7\"\n" +
                "                        },\n" +
                "                        \"AssignedPersonnelSourceSystem\": {\n" +
                "                            \"@Code\": \"undchnundrtlpround\",\n" +
                "                            \"SourceTimestamp\": \"2019-02-11T12:00:00\",\n" +
                "                            \"AffiliateCode\": \"CHN\",\n" +
                "                            \"MarketCode\": \"CHN\",\n" +
                "                            \"DivisionCode\": \"CHN\",\n" +
                "                            \"BrandCode\": \"CHN\",\n" +
                "                            \"PersonnelCode\": \"CHN\"\n" +
                "                        },\n" +
                "                        \"HobbyList\": {\n" +
                "                            \"Hobby\": [\n" +
                "                                {\n" +
                "                                    \"HobbyDescription\": \"Cooking\"\n" +
                "                                }\n" +
                "                            ]\n" +
                "                        },\n" +
                "                        \"GeneralOptInFlag\": true,\n" +
                "                        \"GeneralOptInDate\": \"2019-02-11T12:00:00\",\n" +
                "                        \"DoNotContact\": true,\n" +
                "                        \"SkinConcernsList\": {\n" +
                "                            \"SkinConcerns\": [\n" +
                "                                \"Dry Skin\"\n" +
                "                            ]\n" +
                "                        },\n" +
                "                        \"HairTypeList\": {\n" +
                "                            \"HairType\": [\n" +
                "                                \"Curly\"\n" +
                "                            ]\n" +
                "                        },\n" +
                "                        \"MakeUpConcernList\": {\n" +
                "                            \"MakeUpConcerns\": [\n" +
                "                                \"Dry Skin\"\n" +
                "                            ]\n" +
                "                        },\n" +
                "                        \"AgeRange\": {\n" +
                "                            \"AgeFrom\": \"30\",\n" +
                "                            \"AgeTo\": \"30\"\n" +
                "                        },\n" +
                "                        \"HairConcernsList\": {\n" +
                "                            \"HairConcerns\": [\n" +
                "                                \"Dusty Hair\"\n" +
                "                            ]\n" +
                "                        },\n" +
                "                        \"Nationality\": \"Chinese\",\n" +
                "                        \"FirstPurchaseDate\": \"2019-02-11T12:00:00\"\n" +
                "                    },\n" +
                "                    \"ContactInformation\": {\n" +
                "                        \"EMediaList\": {\n" +
                "                            \"EMedia\": {\n" +
                "                                \"@TypeCode\": \"emlprs\",\n" +
                "                                \"SourceTimestamp\": \"2017-04-06T00:00:00Z\",\n" +
                "                                \"Address\": \"carmen.tu88@yahoo.com\",\n" +
                "                                \"DataQualityCode\": \"vld\",\n" +
                "                                \"DataQualityDescription\": \"Valid\"\n" +
                "                            }\n" +
                "                        },\n" +
                "                        \"PhoneList\": {\n" +
                "                            \"Phone\": [\n" +
                "                                {\n" +
                "                                    \"@TypeCode\": \"mblprs\",\n" +
                "                                    \"SourceTimestamp\": \"2019-02-11T12:00:00\",\n" +
                "                                    \"CountryCode_ISO3\": \"CHN\",\n" +
                "                                    \"PhoneCountryCode\": \"\",\n" +
                "                                    \"RegionalCode\": \"\",\n" +
                "                                    \"Extension\": \"\",\n" +
                "                                    \"PhoneNumber\": \"51275127\",\n" +
                "                                    \"RegPhoneTypeCode\": \"\",\n" +
                "                                    \"Registrar\": \"\",\n" +
                "                                    \"DataQualityCode\": \"vld\",\n" +
                "                                    \"DataQualityDescription\": \"valid\"\n" +
                "                                }\n" +
                "                            ]\n" +
                "                        },\n" +
                "                        \"AddressList\": {\n" +
                "                            \"Address\": {\n" +
                "                                \"@TypeCode\": \"prs\",\n" +
                "                                \"SourceTimestamp\": \"2017-04-06T00:00:00Z\",\n" +
                "                                \"Address1\": \"8号室 李小方 （先生）收\",\n" +
                "                                \"Address2\": \"8号室 李小方 （先生）收\",\n" +
                "                                \"Address3\": \"8号室 李小方 （先生）收\",\n" +
                "                                \"Address4\": \"8号室 李小方 （先生）收\",\n" +
                "                                \"Address5\": \"8号室 李小方 （先生）收\",\n" +
                "                                \"FlatNo\": \"as\",\n" +
                "                                \"Floor\": \"as\",\n" +
                "                                \"Block\": \"as\",\n" +
                "                                \"Phase\": \"as\",\n" +
                "                                \"Building\": \"as\",\n" +
                "                                \"StreetNo\": \"as\",\n" +
                "                                \"StreetNoSuffix\": \"as\",\n" +
                "                                \"Alley\": \"as\",\n" +
                "                                \"StreetName\": \"as\",\n" +
                "                                \"StreetName2\": \"as\",\n" +
                "                                \"Estate\": \"as\",\n" +
                "                                \"LaneNo\": \"as\",\n" +
                "                                \"LaneName\": \"as\",\n" +
                "                                \"Sector\": \"as\",\n" +
                "                                \"POBox\": \"as\",\n" +
                "                                \"PostalCode\": \"4000\",\n" +
                "                                \"SubCityCode\": \"as\",\n" +
                "                                \"SubCityCodeDescription_en\": \"as\",\n" +
                "                                \"SubCityCodeDescription_local\": \"as\",\n" +
                "                                \"CityCode\": \"as\",\n" +
                "                                \"CityDescription_en\": \"as\",\n" +
                "                                \"CityDescription_local\": \"BRISBANE CITY\",\n" +
                "                                \"Province\": \"as\",\n" +
                "                                \"ProvinceCode\": \"as\",\n" +
                "                                \"ProvinceDescription_en\": \"as\",\n" +
                "                                \"ProvinceDescription_local\": \"QLD\",\n" +
                "                                \"AdminArea\": \"as\",\n" +
                "                                \"CountryCode_ISO3\": \"as\",\n" +
                "                                \"NUTSCode\": \"as\",\n" +
                "                                \"Longitude\": \"as\",\n" +
                "                                \"Latitude\": \"as\",\n" +
                "                                \"GeocodeResolution\": \"as\",\n" +
                "                                \"GeographicalSpokenLanguage\": \"as\",\n" +
                "                                \"DataQualityCode\": \"as\",\n" +
                "                                \"DataQualityDescription\": \"as\"\n" +
                "                            }\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"OptInList\": {\n" +
                "                        \"OptIn\": [\n" +
                "                            {\n" +
                "                                \"OptInTimestamp\": \"2017-04-06T00:00:00Z\",\n" +
                "                                \"CommunicationChannelCode\": \"drcml\",\n" +
                "                                \"OptInFlag\": true,\n" +
                "                                \"OptInSourceSystemCode\": \"drcml\"\n" +
                "                            }\n" +
                "                        ]\n" +
                "                    },\n" +
                "                    \"CrossBrandOptInList\": {\n" +
                "                        \"CrossBrandOptIn\": [\n" +
                "                            {\n" +
                "                                \"OptInTimestamp\": \"2019-02-11T12:00:00\",\n" +
                "                                \"OptInFlag\": \"true\"\n" +
                "                            }\n" +
                "                        ]\n" +
                "                    },\n" +
                "                    \"AuxiliaryAttributeList\": {\n" +
                "                        \"AuxiliaryAttribute\": [\n" +
                "                            {\n" +
                "                                \"@Code\": \"axlexm\",\n" +
                "                                \"Description\": \"Auxilary Attributes example\",\n" +
                "                                \"MultiValue\": \"false\",\n" +
                "                                \"@Value\": \"example\",\n" +
                "                                \"Active\": \"true\"\n" +
                "                            }\n" +
                "                        ]\n" +
                "                    },\n" +
                "                    \"TermsAndConditionList\": {\n" +
                "                        \"TermsAndCondition\": [\n" +
                "                            {\n" +
                "                                \"@Code\": \"trmsexm\",\n" +
                "                                \"Description\": \"Terms Example\",\n" +
                "                                \"Version\": \"1.0\",\n" +
                "                                \"AcceptedDate\": \"2019-02-11T12:00:00\"\n" +
                "                            }\n" +
                "                        ]\n" +
                "                    },\n" +
                "                    \"CustomAttributeList\": {\n" +
                "                        \"CustomAttribute\": [\n" +
                "                            {\n" +
                "                                \"@Name\": \"Customer Id\",\n" +
                "                                \"@Value\": \"1210\"\n" +
                "                            }\n" +
                "                        ]\n" +
                "                    },\n" +
                "                    \"CustomerGroupList\": {\n" +
                "                        \"CustomerGroup\": [\n" +
                "                            \"High Value\"\n" +
                "                        ]\n" +
                "                    },\n" +
                "                    \"RemarkList\": {\n" +
                "                        \"Remark\": [\n" +
                "                            {\n" +
                "                                \"RemarkCode\": \"tstrmk\",\n" +
                "                                \"RemarksDate\": \"2019-02-11\",\n" +
                "                                \"Remarks\": \"Test Remark\"\n" +
                "                            }\n" +
                "                        ]\n" +
                "                    },\n" +
                "                    \"NoteList\": {\n" +
                "                        \"Note\": [\n" +
                "                            {\n" +
                "                                \"SeqNum\": \"1\",\n" +
                "                                \"Type\": \"exm\",\n" +
                "                                \"Location\": \"chn\",\n" +
                "                                \"Note\": \"note\",\n" +
                "                                \"CreateDate\": \"2019-02-11\",\n" +
                "                                \"CreateBy\": \"BA\",\n" +
                "                                \"UpdateDate\": \"2019-02-11\",\n" +
                "                                \"UpdateBy\": \"BA\"\n" +
                "                            }\n" +
                "                        ]\n" +
                "                    }\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    }\n" +
                "}";

        str1="{\n" +
                "                \"Program\": [\n" +
                "                    {\n" +
                "                        \"ApplicationTouchPointCode\": \"23\",\n" +
                "                        \"ConsumerGroup\": \"High Valued Consumer\",\n" +
                "                        \"ProgramTypeCode\": \"chn01rntclb\",\n" +
                "                        \"ProgramTypeDescription\": \"China / Estēe Lauder — Re-Nutriv Club\",\n" +
                "                        \"ProgramLevelCode\": \"chn01rntclb\",\n" +
                "                        \"ProgramLevelDescription\": \"China / Estēe Lauder — Re-Nutriv Club\",\n" +
                "                        \"ProgramSystemIDCode\": \"chn01rntclb\",\n" +
                "                        \"ProgramSystemIDDescription\": \"China / Estēe Lauder — Re-Nutriv Club\",\n" +
                "                        \"MembershipNum\": \"121012101210\",\n" +
                "                        \"CardNum\": \"121012101210\",\n" +
                "                        \"StartTimestamp\": \"2019-02-11T12:00:00\",\n" +
                "                        \"EndTimestamp\": \"2020-02-11T12:00:00\",\n" +
                "                        \"PointsAcquired\": \"150\",\n" +
                "                        \"PointsRedeemed\": \"100\",\n" +
                "                        \"InitialQuota\": \"150\",\n" +
                "                        \"AvailableQuota\": \"50\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }";
    }

    @Autowired
    private Handler handler1;
    @Test
    void contextLoads() {
    }


    @Test
    void testReflection() throws Exception {
        Class clazz=Class.forName("com.elccep.common.enity.JavaObj");
        System.out.println(clazz.getName());
    }


    @Test
    void testProperties() throws IOException {
        InputStream in=new FileInputStream(new File("src\\main\\resources\\ConsumerBestRecord_OperationConfig.properties"));
        Properties properties=new Properties();
        properties.load(in);
        System.out.println(properties.getProperty("header.action"));
        System.out.println(in);
    }

    @Test
    void testFastJson() {

        JSONObject jsonObject= JSON.parseObject(str);
        System.out.println(jsonObject.get("Header"));
//        JsonPath.read();
//        System.out.println(jsonObject.toString());
    }


    @Test
    void testHandler() throws Exception {
        Handler handler=new Handler<com.elccep.common.enity.JavaObj>();
        System.out.println((Object)handler.handle("com.elccep.common.enity.javaObj.Header",str,environment));
//        handler.handle("com.elccep.common.enity.javaObj.Header",myProperties.getProperties(),str);
    }


    @Test
    void testHandler1() throws Exception {
//        System.out.println((Object)handler.handle("com.elccep.common.enity.javaObj.Header",myProperties.getProperties(),str));
//        handler.handle("com.elccep.common.enity.javaObj.Header",myProperties.getProperties(),str);
        JavaObj javaObj = JSON.parseObject(str,com.elccep.common.enity.JavaObj.class);
        System.out.println(javaObj);
    }
    @Test
    void testHandler2() throws Exception {
//        System.out.println((Object)handler.handle("com.elccep.common.enity.javaObj.Header",myProperties.getProperties(),str));
//        handler.handle("com.elccep.common.enity.javaObj.Header",myProperties.getProperties(),str);
        ProgramList javaObj = JSON.parseObject(str1,com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.ProgramList.class);
        System.out.println(javaObj);
    }


    @Test
    void testHandler3() throws Exception {
//        System.out.println((Object)handler.handle("com.elccep.common.enity.javaObj.Header",myProperties.getProperties(),str));
        Handler handler=new Handler<com.elccep.common.enity.JavaObj>();
        handler.handle("com.elccep.common.enity.JavaObj",JSON.parseObject(str),environment);
        System.out.println();
    }

    @Test
    void testHandler4() throws Exception {
//        System.out.println((Object)handler.handle("com.elccep.common.enity.javaObj.Header",myProperties.getProperties(),str));
        Handler handler=new Handler<com.elccep.common.enity.JavaObj>();
        JavaObj obj = (JavaObj) handler.handle("com.elccep.common.enity.javaObj.Header", JSON.parseObject(str2),environment);
        System.out.println(obj);
    }

    @Test
    void testHandler5() throws Exception {
//        System.out.println((Object)handler.handle("com.elccep.common.enity.javaObj.Header",myProperties.getProperties(),str));
        Handler handler=new Handler<com.elccep.common.enity.JavaObj>();
        JavaObj obj = (JavaObj) handler.handle("com.elccep.common.enity.javaObj.consumerBestRecord.bestRecord.SourceSystemList", JSON.parseObject(str3),environment);
        System.out.println(obj);
    }
    @Test
    void testHandler6() throws Exception {
//        System.out.println((Object)handler.handle("com.elccep.common.enity.javaObj.Header",myProperties.getProperties(),str));
        Handler handler=new Handler<com.elccep.common.enity.JavaObj>();
        JavaObj obj = (JavaObj) handler.handle("com.elccep.common.enity.JavaObj", JSON.parseObject(str),environment);
        System.out.println(obj);
    }


    @Test
    void testHandler7() throws Exception {
//        System.out.println((Object)handler.handle("com.elccep.common.enity.javaObj.Header",myProperties.getProperties(),str));
//        Handler handler=new Handler<com.elccep.common.enity.JavaObj>();
        JavaObj obj = (JavaObj) handler1.handle("com.elccep.common.enity.JavaObj", JSON.parseObject(str),environment);
        System.out.println(obj);
    }

    @Test
    void testStrReplace(){
        String s="123";
        String ss=s.replace("123","");
        System.out.println("------------"+ss);
    }
}
