'use strict';
angular.module('app')
       .controller('search_controller', ['$scope','$window','search_factory', function ($scope,$window, search_factory) {
       
   $scope.Result=search_factory.getResult();
         $scope.Search=search_factory.getKeyWord();
  
    $scope.init=function() {
        
   $scope.Count=10;
   $scope.Tag="All";
    };
//    $scope.getResult=function(){
//         $scope.Result=search_factory.getResult();
//         $scope.Search=search_factory.getKeyWord();
//    };
    $scope.submit= function() {
        if ($scope.Search==null)return;
       if ($scope.Count==null)  $scope.Count=10;
       if ($scope.Tag==null)$scope.Tag="All";
        search_factory.Search($scope.Search,$scope.Count,$scope.Tag)
            .then(function (response) {
                $scope.Result = response.data;
        debugger;
         $window.location.href = '/#/result';
            }, function (error) {
                $scope.Status = 'Unable to load data: ' + error.message;
            });
    };
   
    }]);