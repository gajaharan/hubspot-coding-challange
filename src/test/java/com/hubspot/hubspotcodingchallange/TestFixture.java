package com.hubspot.hubspotcodingchallange;

public class TestFixture {
    public static String GET_PARTNER_RESPONSE = """
        {
            "partners": [
          {
            "firstName": "Darin",
            "lastName": "Daignault",
            "email": "ddaignault@hubspotpartners.com",
            "country": "United States",
            "availableDates": [
            "2017-05-03",
            "2017-05-06"
            ]
          },
          {
            "firstName": "Crystal",
            "lastName": "Brenna",
            "email": "cbrenna@hubspotpartners.com",
            "country": "Ireland",
            "availableDates": [
            "2017-04-27",
            "2017-04-29",
            "2017-04-30"
            ]
          },
          {
            "firstName": "Janyce",
            "lastName": "Gustison",
            "email": "jgustison@hubspotpartners.com",
            "country": "Spain",
            "availableDates": [
            "2017-04-29",
            "2017-04-30",
            "2017-05-01"
            ]
          },
          {
            "firstName": "Tifany",
            "lastName": "Mozie",
            "email": "tmozie@hubspotpartners.com",
            "country": "Spain",
            "availableDates": [
            "2017-04-28",
            "2017-04-29",
            "2017-05-01",
            "2017-05-04"
            ]
          },
          {
            "firstName": "Temple",
            "lastName": "Affelt",
            "email": "taffelt@hubspotpartners.com",
            "country": "Spain",
            "availableDates": [
            "2017-04-28",
            "2017-04-29",
            "2017-05-02",
            "2017-05-04"
            ]
          },
          {
            "firstName": "Robyn",
            "lastName": "Yarwood",
            "email": "ryarwood@hubspotpartners.com",
            "country": "Spain",
            "availableDates": [
            "2017-04-29",
            "2017-04-30",
            "2017-05-02",
            "2017-05-03"
            ]
          },
          {
            "firstName": "Shirlene",
            "lastName": "Filipponi",
            "email": "sfilipponi@hubspotpartners.com",
            "country": "Spain",
            "availableDates": [
            "2017-04-30",
            "2017-05-01"
            ]
          },
          {
            "firstName": "Oliver",
            "lastName": "Majica",
            "email": "omajica@hubspotpartners.com",
            "country": "Spain",
            "availableDates": [
            "2017-04-28",
            "2017-04-29",
            "2017-05-01",
            "2017-05-03"
            ]
          },
          {
            "firstName": "Wilber",
            "lastName": "Zartman",
            "email": "wzartman@hubspotpartners.com",
            "country": "Spain",
            "availableDates": [
            "2017-04-29",
            "2017-04-30",
            "2017-05-02",
            "2017-05-03"
            ]
          },
          {
            "firstName": "Eugena",
            "lastName": "Auther",
            "email": "eauther@hubspotpartners.com",
            "country": "United States",
            "availableDates": [
            "2017-05-04",
            "2017-05-09"
            ]
          }
            ]
          }            
            """.trim();

    public static String GET_PARTNER_LIST = """
        [{
                "firstName": "Darin",
                "lastName": "Daignault",
                "email": "ddaignault@hubspotpartners.com",
                "country": "United States",
                "availableDates": [
                    "2017-05-03",
                    "2017-05-06"
                ]
            },
            {
                "firstName": "Crystal",
                "lastName": "Brenna",
                "email": "cbrenna@hubspotpartners.com",
                "country": "Ireland",
                "availableDates": [
                    "2017-04-27",
                    "2017-04-29",
                    "2017-04-30"
                ]
            },
            {
                "firstName": "Janyce",
                "lastName": "Gustison",
                "email": "jgustison@hubspotpartners.com",
                "country": "Spain",
                "availableDates": [
                    "2017-04-29",
                    "2017-04-30",
                    "2017-05-01"
                ]
            },
            {
                "firstName": "Tifany",
                "lastName": "Mozie",
                "email": "tmozie@hubspotpartners.com",
                "country": "Spain",
                "availableDates": [
                    "2017-04-28",
                    "2017-04-29",
                    "2017-05-01",
                    "2017-05-04"
                ]
            },
            {
                "firstName": "Temple",
                "lastName": "Affelt",
                "email": "taffelt@hubspotpartners.com",
                "country": "Spain",
                "availableDates": [
                    "2017-04-28",
                    "2017-04-29",
                    "2017-05-02",
                    "2017-05-04"
                ]
            },
            {
                "firstName": "Robyn",
                "lastName": "Yarwood",
                "email": "ryarwood@hubspotpartners.com",
                "country": "Spain",
                "availableDates": [
                    "2017-04-29",
                    "2017-04-30",
                    "2017-05-02",
                    "2017-05-03"
                ]
            },
            {
                "firstName": "Shirlene",
                "lastName": "Filipponi",
                "email": "sfilipponi@hubspotpartners.com",
                "country": "Spain",
                "availableDates": [
                    "2017-04-30",
                    "2017-05-01"
                ]
            },
            {
                "firstName": "Oliver",
                "lastName": "Majica",
                "email": "omajica@hubspotpartners.com",
                "country": "Spain",
                "availableDates": [
                    "2017-04-28",
                    "2017-04-29",
                    "2017-05-01",
                    "2017-05-03"
                ]
            },
            {
                "firstName": "Wilber",
                "lastName": "Zartman",
                "email": "wzartman@hubspotpartners.com",
                "country": "Spain",
                "availableDates": [
                    "2017-04-29",
                    "2017-04-30",
                    "2017-05-02",
                    "2017-05-03"
                ]
            },
            {
                "firstName": "Eugena",
                "lastName": "Auther",
                "email": "eauther@hubspotpartners.com",
                "country": "United States",
                "availableDates": [
                    "2017-05-04",
                    "2017-05-09"
                ]
            }
        ]            
            """.trim();

    public static String SEND_INVITATION_LIST_REQUEST = """
        {
            "countries": [
          {
            "attendeeCount": 1,
            "attendees": [
            "cbrenna@hubspotpartners.com"
            ],
            "name": "Ireland",
            "startDate": "2017-04-29"
          },
          {
            "attendeeCount": 0,
            "attendees": [],
            "name": "United States",
            "startDate": null
          },
          {
            "attendeeCount": 3,
            "attendees": [
            "omajica@hubspotpartners.com",
            "taffelt@hubspotpartners.com",
            "tmozie@hubspotpartners.com"
            ],
            "name": "Spain",
            "startDate": "2017-04-28"
          }
            ]
          }            
            """.trim();

    public static String SEND_INVITATION_LIST = """
[
          {
            "attendeeCount": 0,
            "attendees": [],
            "name": "United States",
            "startDate": null
          },
          {
            "attendeeCount": 1,
            "attendees": [
            "cbrenna@hubspotpartners.com"
            ],
            "name": "Ireland",
            "startDate": "2017-04-29"
          },
          {
            "attendeeCount": 3,
            "attendees": [
            "omajica@hubspotpartners.com",
            "taffelt@hubspotpartners.com",
            "tmozie@hubspotpartners.com"
            ],
            "name": "Spain",
            "startDate": "2017-04-28"
          }
            ]
         """.trim();
}
