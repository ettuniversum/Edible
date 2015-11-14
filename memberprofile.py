# -*- coding: utf-8 -*-
"""
Created on Thu Nov 12 22:21:22 2015

@author: Lorin
"""
import json  

class memberprofile():
    
    def __init__(self):
        self.id = 0
        self.username = ''
        self.email = ''
        self.allergyAssociation = {"Tomato": ["marinara", "ketchup"], "Pepper": {"Paprika"}}
        self.allergyUserKeywords = 20
        
    def getAllergyAssociation(self):
        dictAllergy = self.allergyAssociation
        return dictAllergy 