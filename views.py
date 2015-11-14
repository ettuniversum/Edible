# -*- coding: utf-8 -*-
"""
Created on Wed Aug 19 22:30:37 2015

@author: Lorin
"""
from django.shortcuts import render
from django.http import HttpResponse
import datetime
from nutritionix import Nutritionix
import RestaurantBrand
from django.shortcuts import render
from django.template import loader, Context


def Restaurants(request, id_):
    RestBrand = RestaurantBrand.RestaurantBrand(id_)
    c = Context({
        'RestaurantName': RestBrand.Name,
        'RestaurantWebsite': RestBrand.Website
    })
    return render(request, 'restaurant.html', c)

    
def Brand(request):
    return render(request, 'restaurant.html')
    
def Home(request):
    return render(request, 'index.html')
    
def hello(request):
    return HttpResponse("Hello world")
    
def current_datetime(request):
    now = datetime.datetime.now()
    return render(request, 'current_datetime.html', {'current_date': now})
    

def hours_ahead(request, offset):
    try:
        offset = int(offset)
    except ValueError:
        raise Http404()
    dt = datetime.datetime.now() + datetime.timedelta(hours=offset)
    html = "<html><body>In %s hour(s), it will be %s.</body></html>" % (offset, dt)
    return HttpResponse(html)