function FieldCtrl($scope, $http) {
    $scope.is_record = true;
    $scope.view_record_active = 'active';
    $scope.new_record_active = '';

    $scope.viewRecord = function () {
        if(!$scope.is_record){
            $scope.view_record_active = 'active';
            $scope.new_record_active = '';
            $scope.is_record = true;
        }
    };

    $scope.newRecord = function () {
        if($scope.is_record){
            $scope.view_record_active = '';
            $scope.new_record_active = 'active';
            $scope.is_record = false;
        }
    };


    $http({
        url: "field/findbypage",
        method: "get",
        params: {
            pageNum: 1
        }
    }).success(function (res) {
        console.log(res)
    });
}

function FieldDetailCtrl($scope) {

}