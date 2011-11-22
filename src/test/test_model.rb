class TestModel
  
  attr_accessor :cards, :current_card
  DELIMITER = "----"
  
  def initialize
    @cards = []
    @current_index = 0
  end

  def load_cards(input)
    @cards = input.read().split("----").collect { |item| item.strip }
  end

  def select_card(card_number=nil)
    @current_index = 0 if @current_index == @cards.length 
    @current_card = @cards[@current_index]
    @current_index = @current_index + 1
    @current_card
  end

end
