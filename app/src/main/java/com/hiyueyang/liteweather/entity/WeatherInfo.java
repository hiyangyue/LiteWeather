package com.hiyueyang.liteweather.entity;

import java.util.List;

/**
 * Created by YueYang on 2016/3/14.
 */
public class WeatherInfo {


    /**
     * errNum : 0
     * errMsg : success
     * retData : {"city":"北京","cityid":"101010100","today":{"date":"2016-03-18","week":"星期五","curTemp":"20℃","aqi":"177","fengxiang":"无持续风向","fengli":"微风级","hightemp":"21℃","lowtemp":"5℃","type":"霾","index":[{"name":"感冒指数","code":"gm","index":"","details":"昼夜温差大，且空气湿度较大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。","otherName":""},{"code":"fs","details":"属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","index":"弱","name":"防晒指数","otherName":""},{"code":"ct","details":"建议着大衣、呢外套加毛衣、卫衣等服装。体弱者宜着厚外套、厚毛衣。因昼夜温差较大，注意增减衣服。","index":"较冷","name":"穿衣指数","otherName":""},{"code":"yd","details":"有扬沙或浮尘，建议适当停止户外运动，选择在室内进行运动，以避免吸入更多沙尘，有损健康。","index":"较不宜","name":"运动指数","otherName":""},{"code":"xc","details":"不宜洗车，未来24小时内有霾，如果在此期间洗车，会弄脏您的爱车。","index":"不宜","name":"洗车指数","otherName":""},{"code":"ls","details":"有雾，潮湿不洁的雾气不仅不利于水分蒸发，而且容易污染衣物，不适宜晾晒。","index":"不宜","name":"晾晒指数","otherName":""}]},"forecast":[{"date":"2016-03-19","week":"星期六","fengxiang":"无持续风向","fengli":"微风级","hightemp":"15℃","lowtemp":"4℃","type":"多云"},{"date":"2016-03-20","week":"星期天","fengxiang":"无持续风向","fengli":"微风级","hightemp":"16℃","lowtemp":"4℃","type":"多云"},{"date":"2016-03-21","week":"星期一","fengxiang":"无持续风向","fengli":"微风级","hightemp":"16℃","lowtemp":"6℃","type":"多云"},{"date":"2016-03-22","week":"星期二","fengxiang":"无持续风向","fengli":"微风级","hightemp":"18℃","lowtemp":"6℃","type":"多云"}],"history":[{"date":"2016-03-11","week":"星期五","aqi":"46","fengxiang":"无持续风向","fengli":"微风级","hightemp":"8℃","lowtemp":"-1℃","type":"晴"},{"date":"2016-03-12","week":"星期六","aqi":"154","fengxiang":"无持续风向","fengli":"微风级","hightemp":"9℃","lowtemp":"1℃","type":"多云"},{"date":"2016-03-13","week":"星期天","aqi":"46","fengxiang":"北风","fengli":"3-4级","hightemp":"12℃","lowtemp":"-1℃","type":"晴"},{"date":"2016-03-14","week":"星期一","aqi":"58","fengxiang":"无持续风向","fengli":"微风级","hightemp":"15℃","lowtemp":"3℃","type":"晴"},{"date":"2016-03-15","week":"星期二","aqi":"215","fengxiang":"无持续风向","fengli":"微风级","hightemp":"14℃","lowtemp":"2℃","type":"多云"},{"date":"2016-03-16","week":"星期三","aqi":"319","fengxiang":"无持续风向","fengli":"微风级","hightemp":"17℃","lowtemp":"6℃","type":"霾"},{"date":"2016-03-17","week":"星期四","aqi":"335","fengxiang":"无持续风向","fengli":"微风级","hightemp":"18℃","lowtemp":"6℃","type":"霾"}]}
     */

    private int errNum;
    private String errMsg;
    /**
     * city : 北京
     * cityid : 101010100
     * today : {"date":"2016-03-18","week":"星期五","curTemp":"20℃","aqi":"177","fengxiang":"无持续风向","fengli":"微风级","hightemp":"21℃","lowtemp":"5℃","type":"霾","index":[{"name":"感冒指数","code":"gm","index":"","details":"昼夜温差大，且空气湿度较大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。","otherName":""},{"code":"fs","details":"属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","index":"弱","name":"防晒指数","otherName":""},{"code":"ct","details":"建议着大衣、呢外套加毛衣、卫衣等服装。体弱者宜着厚外套、厚毛衣。因昼夜温差较大，注意增减衣服。","index":"较冷","name":"穿衣指数","otherName":""},{"code":"yd","details":"有扬沙或浮尘，建议适当停止户外运动，选择在室内进行运动，以避免吸入更多沙尘，有损健康。","index":"较不宜","name":"运动指数","otherName":""},{"code":"xc","details":"不宜洗车，未来24小时内有霾，如果在此期间洗车，会弄脏您的爱车。","index":"不宜","name":"洗车指数","otherName":""},{"code":"ls","details":"有雾，潮湿不洁的雾气不仅不利于水分蒸发，而且容易污染衣物，不适宜晾晒。","index":"不宜","name":"晾晒指数","otherName":""}]}
     * forecast : [{"date":"2016-03-19","week":"星期六","fengxiang":"无持续风向","fengli":"微风级","hightemp":"15℃","lowtemp":"4℃","type":"多云"},{"date":"2016-03-20","week":"星期天","fengxiang":"无持续风向","fengli":"微风级","hightemp":"16℃","lowtemp":"4℃","type":"多云"},{"date":"2016-03-21","week":"星期一","fengxiang":"无持续风向","fengli":"微风级","hightemp":"16℃","lowtemp":"6℃","type":"多云"},{"date":"2016-03-22","week":"星期二","fengxiang":"无持续风向","fengli":"微风级","hightemp":"18℃","lowtemp":"6℃","type":"多云"}]
     * history : [{"date":"2016-03-11","week":"星期五","aqi":"46","fengxiang":"无持续风向","fengli":"微风级","hightemp":"8℃","lowtemp":"-1℃","type":"晴"},{"date":"2016-03-12","week":"星期六","aqi":"154","fengxiang":"无持续风向","fengli":"微风级","hightemp":"9℃","lowtemp":"1℃","type":"多云"},{"date":"2016-03-13","week":"星期天","aqi":"46","fengxiang":"北风","fengli":"3-4级","hightemp":"12℃","lowtemp":"-1℃","type":"晴"},{"date":"2016-03-14","week":"星期一","aqi":"58","fengxiang":"无持续风向","fengli":"微风级","hightemp":"15℃","lowtemp":"3℃","type":"晴"},{"date":"2016-03-15","week":"星期二","aqi":"215","fengxiang":"无持续风向","fengli":"微风级","hightemp":"14℃","lowtemp":"2℃","type":"多云"},{"date":"2016-03-16","week":"星期三","aqi":"319","fengxiang":"无持续风向","fengli":"微风级","hightemp":"17℃","lowtemp":"6℃","type":"霾"},{"date":"2016-03-17","week":"星期四","aqi":"335","fengxiang":"无持续风向","fengli":"微风级","hightemp":"18℃","lowtemp":"6℃","type":"霾"}]
     */

    private RetDataEntity retData;

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public void setRetData(RetDataEntity retData) {
        this.retData = retData;
    }

    public int getErrNum() {
        return errNum;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public RetDataEntity getRetData() {
        return retData;
    }

    public static class RetDataEntity {
        private String city;
        private String cityid;
        /**
         * date : 2016-03-18
         * week : 星期五
         * curTemp : 20℃
         * aqi : 177
         * fengxiang : 无持续风向
         * fengli : 微风级
         * hightemp : 21℃
         * lowtemp : 5℃
         * type : 霾
         * index : [{"name":"感冒指数","code":"gm","index":"","details":"昼夜温差大，且空气湿度较大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。","otherName":""},{"code":"fs","details":"属弱紫外辐射天气，长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","index":"弱","name":"防晒指数","otherName":""},{"code":"ct","details":"建议着大衣、呢外套加毛衣、卫衣等服装。体弱者宜着厚外套、厚毛衣。因昼夜温差较大，注意增减衣服。","index":"较冷","name":"穿衣指数","otherName":""},{"code":"yd","details":"有扬沙或浮尘，建议适当停止户外运动，选择在室内进行运动，以避免吸入更多沙尘，有损健康。","index":"较不宜","name":"运动指数","otherName":""},{"code":"xc","details":"不宜洗车，未来24小时内有霾，如果在此期间洗车，会弄脏您的爱车。","index":"不宜","name":"洗车指数","otherName":""},{"code":"ls","details":"有雾，潮湿不洁的雾气不仅不利于水分蒸发，而且容易污染衣物，不适宜晾晒。","index":"不宜","name":"晾晒指数","otherName":""}]
         */

        private TodayEntity today;
        /**
         * date : 2016-03-19
         * week : 星期六
         * fengxiang : 无持续风向
         * fengli : 微风级
         * hightemp : 15℃
         * lowtemp : 4℃
         * type : 多云
         */

        private List<ForecastEntity> forecast;
        /**
         * date : 2016-03-11
         * week : 星期五
         * aqi : 46
         * fengxiang : 无持续风向
         * fengli : 微风级
         * hightemp : 8℃
         * lowtemp : -1℃
         * type : 晴
         */

        private List<HistoryEntity> history;

        public void setCity(String city) {
            this.city = city;
        }

        public void setCityid(String cityid) {
            this.cityid = cityid;
        }

        public void setToday(TodayEntity today) {
            this.today = today;
        }

        public void setForecast(List<ForecastEntity> forecast) {
            this.forecast = forecast;
        }

        public void setHistory(List<HistoryEntity> history) {
            this.history = history;
        }

        public String getCity() {
            return city;
        }

        public String getCityid() {
            return cityid;
        }

        public TodayEntity getToday() {
            return today;
        }

        public List<ForecastEntity> getForecast() {
            return forecast;
        }

        public List<HistoryEntity> getHistory() {
            return history;
        }

        public static class TodayEntity {
            private String date;
            private String week;
            private String curTemp;
            private String aqi;
            private String fengxiang;
            private String fengli;
            private String hightemp;
            private String lowtemp;
            private String type;
            /**
             * name : 感冒指数
             * code : gm
             * index :
             * details : 昼夜温差大，且空气湿度较大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。
             * otherName :
             */

            private List<IndexEntity> index;

            public void setDate(String date) {
                this.date = date;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public void setCurTemp(String curTemp) {
                this.curTemp = curTemp;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public void setHightemp(String hightemp) {
                this.hightemp = hightemp;
            }

            public void setLowtemp(String lowtemp) {
                this.lowtemp = lowtemp;
            }

            public void setType(String type) {
                this.type = type;
            }

            public void setIndex(List<IndexEntity> index) {
                this.index = index;
            }

            public String getDate() {
                return date;
            }

            public String getWeek() {
                return week;
            }

            public String getCurTemp() {
                return curTemp;
            }

            public String getAqi() {
                return aqi;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public String getFengli() {
                return fengli;
            }

            public String getHightemp() {
                return hightemp;
            }

            public String getLowtemp() {
                return lowtemp;
            }

            public String getType() {
                return type;
            }

            public List<IndexEntity> getIndex() {
                return index;
            }

            public static class IndexEntity {
                private String name;
                private String code;
                private String index;
                private String details;
                private String otherName;

                public void setName(String name) {
                    this.name = name;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public void setIndex(String index) {
                    this.index = index;
                }

                public void setDetails(String details) {
                    this.details = details;
                }

                public void setOtherName(String otherName) {
                    this.otherName = otherName;
                }

                public String getName() {
                    return name;
                }

                public String getCode() {
                    return code;
                }

                public String getIndex() {
                    return index;
                }

                public String getDetails() {
                    return details;
                }

                public String getOtherName() {
                    return otherName;
                }
            }
        }

        public static class ForecastEntity {
            private String date;
            private String week;
            private String fengxiang;
            private String fengli;
            private String hightemp;
            private String lowtemp;
            private String type;

            public void setDate(String date) {
                this.date = date;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public void setHightemp(String hightemp) {
                this.hightemp = hightemp;
            }

            public void setLowtemp(String lowtemp) {
                this.lowtemp = lowtemp;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getDate() {
                return date;
            }

            public String getWeek() {
                return week;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public String getFengli() {
                return fengli;
            }

            public String getHightemp() {
                return hightemp;
            }

            public String getLowtemp() {
                return lowtemp;
            }

            public String getType() {
                return type;
            }
        }

        public static class HistoryEntity {
            private String date;
            private String week;
            private String aqi;
            private String fengxiang;
            private String fengli;
            private String hightemp;
            private String lowtemp;
            private String type;

            public void setDate(String date) {
                this.date = date;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public void setHightemp(String hightemp) {
                this.hightemp = hightemp;
            }

            public void setLowtemp(String lowtemp) {
                this.lowtemp = lowtemp;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getDate() {
                return date;
            }

            public String getWeek() {
                return week;
            }

            public String getAqi() {
                return aqi;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public String getFengli() {
                return fengli;
            }

            public String getHightemp() {
                return hightemp;
            }

            public String getLowtemp() {
                return lowtemp;
            }

            public String getType() {
                return type;
            }
        }
    }
}
