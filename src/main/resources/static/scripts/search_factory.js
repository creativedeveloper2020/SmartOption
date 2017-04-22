'use strict';
angular.module('app')
       .service('search_factory', ['$http', function ($http) {

            var urlBase = 'http://localhost:8080/Engine/?Search=';
    var _Result="";
   var KeyWord="";
   var CountResult=0;
            //var DataFactory = {};

//            this.GetMeals = function () {
//                return $http.get(urlBase);
//            };
this.getResult=function(){
    return _Result;
};
this.getKeyWord=function(){
  return KeyWord;  
};
this.getCountResult=function(){
  return CountResult;  
};
            this.Search = function (Search,Count,Tag) {
                return $http.get(urlBase+Search+'&Count='+Count+'&Tag='+Tag)
               
                    .success(function (response) {
                        //First function handles success
                        KeyWord=Search;
                        CountResult=Count;
                        _Result=response;
                        
                    }).error(function () {
                        //Second function handles error
                       
                        alert("error");

                    });
                
            };        
        }]);
