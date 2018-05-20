function ProcessCtrl($scope, $http) {
    $scope.is_record = true;
    $scope.view_record_active = 'active';
    $scope.new_record_active = '';

    $scope.totalPages = 0;
    $scope.pageNum = 1;
    $scope.contents = [];

    $scope.pg1 = 0;
    $scope.pg2 = 0;
    $scope.pg3 = 0;
    $scope.pg4 = 0;
    $scope.pg5 = 0;

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

    var findbypage = function (num) {
        num = parseInt(num);
        if(num < 1 || num > $scope.totalPages)
            return;
        $scope.pageNum = num;
        for(var i = 0;i < 2; i++){
            var cur1 = num - i - 1;
            if(cur1 > 0){
                $scope["pg" + (2 - i)] = cur1;
            }else{
                $scope["pg" + (2 - i)] = 0;
            }
        }
        for(var j = 0;j < 2; j++){
            var cur2 = num + j + 1;
            if(cur2 <= $scope.totalPages){
                $scope["pg" + (j + 4)] = cur2;
            }else{
                $scope["pg" + (j + 4)] = 0;
            }
        }
        $scope["pg3"] = num;
    };


    $scope.turnToPage = function (num) {
        $http({
            url: "process/findbypage",
            method: "get",
            params: {
                pageNum: parseInt(num) - 1
            }
        }).success(function (res) {
            $scope.contents = res.content;
            // console.log($scope.contents);
            $scope.totalPages = res.totalPages;
            $scope.pageNum = parseInt(res.number) + 1;
            findbypage(num);
        });
    };

    $scope.enterDetail = function (content) {
        sessionStorage.setItem('process', JSON.stringify(content));
        // console.log(sessionStorage.getItem('entrepot'));
    };

    var init = function () {
        $scope.turnToPage(1);
    };

    init();
}

function ProcessDetailCtrl($scope, $http, $window) {
    $scope.process = JSON.parse(sessionStorage.getItem('process'));
    console.log($scope.process)

    $scope.totalPages = 0;
    $scope.pageNum = 1;
    $scope.contents = [];

    $scope.pg1 = 0;
    $scope.pg2 = 0;
    $scope.pg3 = 0;
    $scope.pg4 = 0;
    $scope.pg5 = 0;

    var findbypage = function (num) {
        num = parseInt(num);
        if(num < 1 || num > $scope.totalPages)
            return;
        $scope.pageNum = num;
        for(var i = 0;i < 2; i++){
            var cur1 = num - i - 1;
            if(cur1 > 0){
                $scope["pg" + (2 - i)] = cur1;
            }else{
                $scope["pg" + (2 - i)] = 0;
            }
        }
        for(var j = 0;j < 2; j++){
            var cur2 = num + j + 1;
            if(cur2 <= $scope.totalPages){
                $scope["pg" + (j + 4)] = cur2;
            }else{
                $scope["pg" + (j + 4)] = 0;
            }
        }
        $scope["pg3"] = num;
    };


    $scope.turnToPage = function (num) {
        $http({
            url: "process/findbypage",
            method: "get",
            params: {
                pageNum: parseInt(num) - 1
            }
        }).success(function (res) {
            $scope.contents = res.content[0].entrepots;
            // console.log($scope.contents);
            $scope.totalPages = res.totalPages;
            $scope.pageNum = parseInt(res.number) + 1;
            findbypage(num);
        });
    };

    $scope.enterDetail = function (content) {
        sessionStorage.setItem('entrepot', JSON.stringify(content));
        // console.log(sessionStorage.getItem('entrepot'));
    };

    $scope.goback = function () {
        $window.history.back();
    };

    var init = function () {
        $scope.turnToPage(1);
    };

    init();
}