'use strict';
angular.module('app')
       .controller('view_result_controller', ['$scope', 'search_factory', function ($scope,search_factory) {
       
                       $scope.Result=search_factory.getResult();
                   }]);
               
               
