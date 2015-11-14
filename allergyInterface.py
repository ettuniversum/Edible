# -*- coding: utf-8 -*-
"""
Created on Thu Nov 12 22:46:03 2015

@author: Lorin
"""
import memberprofile
import Item
from nutritionix import Nutritionix
import RestaurantBrand

class allergyInterface():
    
    def __init__(self):
        self.aAssociation = []
        self.uAssociation = []
        self.itemDescription = []
        
    def unionMenuItemToAllergy(self, mProfile, menuItem):
        aAssociation = mProfile.allergyAssociation
        uAssociation = mProfile.allergyUserKeywords
        itemDescription = menuItem.item_description
        print(itemDescription)
        
if __name__  == "__main__":
    nix = Nutritionix(app_id="2b90296d", api_key="151384ac0ea68057c320e4160932cd9b")
    aI = allergyInterface()
    mProfile = memberprofile.memberprofile()
    mProfile.__init__()
    #self.mProfile.getId()
    menuItem = Item.Item(nix, "51c3d78797c3e6d8d3b546cf")
    dictAllergy = mProfile.getAllergyAssociation()
    print(dictAllergy)
    #aI.unionMenuItemToAllergy(mProfile, menuItem)
        