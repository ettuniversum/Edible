"""Edible URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/1.8/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  url(r'^$', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  url(r'^$', Home.as_view(), name='home')
Including another URLconf
    1. Add an import:  from blog import urls as blog_urls
    2. Add a URL to urlpatterns:  url(r'^blog/', include(blog_urls))
"""
from django.conf.urls import patterns, url
from Edible.views import Home, Restaurants, Brand

urlpatterns = patterns('',
    url(r'^Brand/id/$', Brand),
    url(r'^Brand/id/(\w{3,})/$', Restaurants), # 513fbc1283aa2dc80c000053
    url(r'^home/$', Home),
)