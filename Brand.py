# -*- coding: utf-8 -*-
"""
Created on Fri Sep 04 18:30:34 2015

@author: Lorin
"""

      
#from django.db import models # for database caching

class Brand(object):
    
    def __init__(self, nutritionixAPI, id_):
        # TODO: Implement Models
        brand =  nutritionixAPI.brand(id_).json()
        #self.Model = models.Model
        self.Name = brand["name"] #self.Model.CharField(max_length=50)
        self.Website = brand["website"] #self.Model.CharField(max_length=500)

        