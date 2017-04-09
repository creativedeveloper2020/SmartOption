'use strict';
angular.module('app')
       .controller('search_controller', ['$scope', '$window','search_factory', function ($scope,$window, search_factory) {
       
     init();
   
    function init() {}
   
    $scope.getResult= function() {
        search_factory.Search($scope.skey)
            .then(function (response) {
                $scope.Result = response.data;
         $window.location.href = './#/result';
            }, function (error) {
                $scope.Status = 'Unable to load customer data: ' + error.message;
            });
    };
    }]);