require 'spec_helper'

describe 'TestModel' do
  describe '::DELIMITER' do
    it 'returns the delimiter string' do
      TestModel::DELIMITER.should == '----'
    end
  end
  
  before(:each) do
    @model = TestModel.new
  end
  
  describe '#load_cards' do
    it "uses DELIMITER do delimit items" do
      input = StringIO.new("a #{TestModel::DELIMITER} b")
      @model.load_cards(input)
      @model.cards.should have(2).items
    end
    
    it "strips whitespace before and after delimeter" do
      input = StringIO.new(" a  #{TestModel::DELIMITER}     b   ")
      @model.load_cards(input)
      @model.cards.should == ['a','b']
    end

    it "handles a single item with no delimiter" do
      input = StringIO.new(" a  ")
      @model.load_cards(input)
      @model.cards.should == ['a']
    end
  end
  
  describe '#select_card' do
    it "sets current_card to the correct card in the collection" do
      @model.cards = ['a']
      @model.select_card(0)
      @model.current_card.should == 'a'
    end
    
    it "returns a card if no index given" do
      @model.cards = ['a','b']
      @model.select_card
      ['a','b'].should include(@model.current_card)
    end
    
    it "doesn't always return the same card" do
      @model.cards = ['a','b','c','d']
      card_picks = Hash[ @model.cards.collect {|c| [c,0] } ]
      0.upto(100) do 
        card =  @model.select_card
        card_picks[ card ] += 1
      end
      
      card_picks.values.each { |count| count.should_not == 0 }
      
    end
    
  end
  
end