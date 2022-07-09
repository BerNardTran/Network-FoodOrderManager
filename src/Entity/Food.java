package Entity;

public class Food {
        private int foodId;
        private String foodName;
        private float foodCost;

        public Food(){}
        public Food(int foodId, String foodName, float foodCost) {
                this.foodId = foodId;
                this.foodName = foodName;
                this.foodCost = foodCost;
        }

        public int getFoodId() {
                return foodId;
        }

        public String getFoodName() {
                return foodName;
        }

        public float getFoodCost() {
                return foodCost;
        }

        public void setFoodId(int foodId) {
                this.foodId = foodId;
        }

        public void setFoodName(String foodName) {
                this.foodName = foodName;
        }

        public void setFoodCost(float foodCost) {
                this.foodCost = foodCost;
        }
}
