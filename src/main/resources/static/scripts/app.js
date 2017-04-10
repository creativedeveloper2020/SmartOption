'use strict';
var app = angular.module('app', ['ngRoute','angular-loading-bar']);



var configFunction = function ($routeProvider, $locationProvider) {

    //$locationProvider.html5Mode(true);
    $routeProvider.
   when('/', {
       templateUrl: './views/start.html'
   }).
    when('/result', {
        
       templateUrl: './views/result.html'
   })
   
    ;
    //$httpProvider.interceptors.push('AuthHttpResponseInterceptor');
};

configFunction.$inject = ['$routeProvider','$locationProvider'];

app.config(configFunction);