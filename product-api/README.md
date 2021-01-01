
# Create DB shopping 
CREATE DATABASE shopping

# Create table 

CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `sku` varchar(45) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`)
);

# http://localhost:8080/actuator/info
{
   "app":{
      "name":"product-api",
      "vaersion":"0.0.1-SNAPSHOT",
      "encoding":"UTF-8",
      "java":{
         "version":"1.8.0_65"
      }
   }
}

# http://localhost:8080/actuator/health

{
   "status":"UP",
   "components":{
      "db":{
         "status":"UP",
         "details":{
            "database":"PostgreSQL",
            "validationQuery":"isValid()"
         }
      },
      "diskSpace":{
         "status":"UP",
         "details":{
            "total":159182221312,
            "free":157235277824,
            "threshold":10485760,
            "exists":true
         }
      },
      "ping":{
         "status":"UP"
      }
   }
}

below are the urls:

# http://localhost:8080/api/product

method : GET

# http://localhost:8080/api/product

method : POST

body :  
{
	"name":"samsung M10",
	"sku" : "SAM3451M10",
	"price" : 15500
}

