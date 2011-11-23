class TestController < ApplicationController
  set_model 'TestModel'
  set_view 'TestView'
  set_close_action :exit

  def initialize
    @editing = false
    super
  end

  def init_view card_file
    model.load_cards( File.open(card_file,"r"))
    model.select_card
  end

  def next_button_action_performed
    model.select_card
    update_view
  end

  def clear_menu_item_action_performed
    signal :clear_text
    #update_view
  end

  def edit_menu_item_action_performed
    @editing = !(@editing)
    transfer[:editing] = @editing
    signal :update_edit
  end

  def quit_menu_item_action_performed
    java.lang.System.exit(0)
  end

end
