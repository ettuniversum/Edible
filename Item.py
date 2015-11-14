# -*- coding: utf-8 -*-
"""
Created on Fri Sep 04 18:30:34 2015

@author: Lorin
"""

from nutritionix import Nutritionix
import json        
#from django.db import models

class Item():
    
    def __init__(self, nutritionixAPI, id_):
        # TODO: Create datbase and implement models
        #self.Model = models.Model
        BrandItem                        = nutritionixAPI.item(id=id_).json() 
        self.allergen_contains_eggs      = BrandItem["allergen_contains_eggs"]
        self.allergen_contains_fish      = BrandItem["allergen_contains_fish"]
        self.allergen_contains_gluten    = BrandItem["allergen_contains_gluten"]
        self.allergen_contains_milk      = BrandItem["allergen_contains_milk"]
        self.allergen_contains_peanuts   = BrandItem["allergen_contains_peanuts"]
        self.allergen_contains_shellfish = BrandItem["allergen_contains_shellfish"]
        self.allergen_contains_soybeans  = BrandItem["allergen_contains_soybeans"]
        self.allergen_contains_tree_nuts = BrandItem["allergen_contains_tree_nuts"]
        self.allergen_contains_wheat     = BrandItem["allergen_contains_wheat"]
        self.brand_id                    = BrandItem["brand_id"]
        self.brand_name                  = BrandItem["brand_name"]
        self.item_description            = BrandItem["item_description"]
        self.item_id                     = BrandItem["item_id"]
        self.item_name                   = BrandItem["item_name"]
        self.leg_loc_id                  = BrandItem["leg_loc_id"]
        self.nf_calcium_dv               = BrandItem["nf_calcium_dv"]
        self.nf_calories                 = BrandItem["nf_calories"]
        self.nf_calories_from_fat        = BrandItem["nf_calories_from_fat"]
        self.nf_cholesterol              = BrandItem["nf_cholesterol"]
        self.nf_dietary_fiber            = BrandItem["nf_dietary_fiber"]
        self.nf_ingredient_statement     = BrandItem["nf_ingredient_statement"]
        self.nf_iron_dv                  = BrandItem["nf_iron_dv"]
        self.nf_monounsaturated_fat      = BrandItem["nf_monounsaturated_fat"]
        self.nf_polyunsaturated_fat      = BrandItem["nf_polyunsaturated_fat"]
        self.nf_protein                  = BrandItem["nf_protein"]
        self.nf_refuse_pct               = BrandItem["nf_refuse_pct"]
        self.nf_saturated_fat            = BrandItem["nf_saturated_fat"]
        self.nf_serving_size_qty         = BrandItem["nf_serving_size_qty"]
        self.nf_serving_size_unit        = BrandItem["nf_serving_size_unit"]
        self.nf_serving_weight_grams     = BrandItem["nf_serving_weight_grams"]
        self.nf_servings_per_container   = BrandItem["nf_servings_per_container"]
        self.nf_sodium                   = BrandItem["nf_sodium"]
        self.nf_sugars                   = BrandItem["nf_sugars"]
        self.nf_total_carbohydrate       = BrandItem["nf_total_carbohydrate"]
        self.nf_total_fat                = BrandItem["nf_total_fat"]
        self.nf_trans_fatty_acid         = BrandItem["nf_trans_fatty_acid"]
        self.nf_vitamin_a_dv             = BrandItem["nf_vitamin_a_dv"]
        self.nf_vitamin_c_dv             = BrandItem["nf_vitamin_c_dv"]
        self.nf_water_grams              = BrandItem["nf_water_grams"]
        self.old_api_id                  = BrandItem["old_api_id"]
        self.updated_at                  = BrandItem["updated_at"]

