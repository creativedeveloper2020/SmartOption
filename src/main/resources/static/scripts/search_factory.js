'use strict';
angular.module('app')
       .service('search_factory', ['$http', function ($http) {

            var urlBase = 'http://localhost:8080/Engine/?Search=';
    var _Result="";
            //var DataFactory = {};

//            this.GetMeals = function () {
//                return $http.get(urlBase);
//            };
this.getResult=function(){
    return _Result;
};
            this.Search = function (keySearch) {
                return $http.get(urlBase+keySearch)
               
                    .success(function (response) {
                        //First function handles success
                        
                        _Result=response;
                        alert("ok");
                        
                    }).error(function () {
                        //Second function handles error
                       
                        alert("error");

                    });
                
            };        
        }]);
