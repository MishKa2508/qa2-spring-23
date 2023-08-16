Feature: Weather forecast

  Scenario:  Ful weather info checks
    Given city ID is 12345

    When we are requesting weather forecast

    Then latitude ia 39.31
    And longitude is -74.5
    And timezone is "America/New_York"
    And timezone offset is -18000

    And current weather data is:
      | dt         | 1646318698 |
      | sunrise    | 1646306882 |
      | sunset     | 1646347929 |
      | temp       | 282.21     |
      | feels like | 278.41     |
      | pressure   | 1014       |
      | humidity   | 65         |
      | dew point  | 275.99     |
      | uvi        | 2.55       |
      | clouds     | 40         |
      | visibility | 10000      |
      | wind speed | 8.75       |
      | wind deg   | 360        |
      | wind gust  | 13.89      |

    And current weather details is:
      | id          | 802             |
      | main        | Clouds          |
      | description | scatteredclouds |
      | icon        | 03d             |

    And current minutely details is:
      | dt            | 1646318700 |
      | precipitation | 0          |

    And current hourly details is:
      | dt         | 1646316000 |
      | temp       | 281.94     |
      | feels like | 278.4      |
      | pressure   | 1014       |
      | humidity   | 67         |
      | dew point  | 276.16     |
      | uvi        | 1.49       |
      | clouds     | 52         |
      | visibility | 10000      |
      | wind speed | 7.16       |
      | wind deg   | 313        |
      | wind gust  | 10.7       |

    And current weather details is:
      | id          | 803          |
      | main        | Clouds       |
      | description | brokenclouds |
      | icon        | 04d          |

    And pop is 0.03

    And current daily details is:
      | dt         | dt1646326800 |
      | sunrise    | 1646306882   |
      | sunset     | 1646347929   |
      | moonrise   | 1646309880   |
      | moonset    | 1646352120   |
      | moon phase | 0.03         |

    And daily temp details is:
      | day   | 281.63 |
      | min   | 271.72 |
      | max   | 282.21 |
      | night | 271.72 |
      | eve   | 277.99 |
      | morn  | 280.92 |
    And daily feels like is:
      | day   | 277.83 |
      | night | 264.72 |
      | eve   | 273.35 |
      | morn  | 277.66 |

    And pressure is 1016
    And humidity is 55
    And dew point is 273.12
    And wind speed is 9.29
    And wind deg is 3
    And wind gust 16.48

    And current weather details is:
      | id          | 500       |
      | main        | Rain      |
      | description | lightrain |
      | icon        | 10d       |

    And clouds is 49
    And pop is 0.25
    And rain is 0.11
    And uvi is 3.38

    And current alerts details is:
    |sender name|NWSPhiladelphia-MountHolly(NewJersey,Delaware,SoutheasternPennsylvania)|
    |event|SmallCraftAdvisory|
    |start|1646344800|
    |end|1646380800|
    |description|...SMALLCRAFTADVISOaft.|
    |tags|private List<String> tags|











