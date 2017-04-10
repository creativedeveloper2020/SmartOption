'use strict';
angular.module('app')
       .controller('search_controller', ['$scope','$window','search_factory', function ($scope,$window, search_factory) {
       
   
  
    $scope.init=function() {
         $scope.Search="World!";
   $scope.Count=10;
   $scope.Tag="All";
    };
    $scope.getResult=function(){
         $scope.Result=search_factory.getResult();
    };
    $scope.submit= function() {
        search_factory.Search($scope.Search,$scope.Count,$scope.Tag)
            .then(function (response) {
                $scope.Result = response;
         $window.location.href = '/#/result';
            }, function (error) {
                $scope.Status = 'Unable to load customer data: ' + error.message;
            });
    };
    }]);