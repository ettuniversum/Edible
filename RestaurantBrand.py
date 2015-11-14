# -*- coding: utf-8 -*-
"""
Created on Fri Sep 04 18:30:34 2015

@author: Lorin
"""
import Brand
from nutritionix import Nutritionix


class RestaurantBrand():
    
    def __init__(self, id_):
        nix = Nutritionix(app_id="2b90296d", api_key="151384ac0ea68057c320e4160932cd9b")
        brand = Brand.Brand(nix, id_)
        self.Name = brand.Name
        self.Website = brand.Website
        #brand.__init__(self, nutritionixAPI, id_)
        
if __name__  == "__main__":
   nix = Nutritionix(app_id="2b90296d", api_key="151384ac0ea68057c320e4160932cd9b")
   Rest = RestaurantBrand("513fbc1283aa2dc80c000053")
   print(Rest)
